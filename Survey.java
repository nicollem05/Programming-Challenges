import java.util.Arrays;

public class Survey{
    // Declare the required array variables
    // store for the five causes
    private final String[] topics;
    // 5x10 to store ratings counts
    private final int[][] responses;
    // store the sum of all ratings for each topic
    private final int[] topicTotals;
    // Counter for the individual votes/ratings
    private int totalVotesProcessed = 0;

    //Constructor initializes the arrays based on the topics provided
    public Survey(String[] iniTopics) {
        this.topics = iniTopics;
        // Create 5 rows (topics) x 10 columns (ratings 1-10)
        this.responses = new int[topics.length][10];
        this.topicTotals = new int[topics.length];

        // Initialize topicTotals to 0
        Arrays.fill(topicTotals, 0);
    }

    //Processes a single user rating for a specific topic.
    public void submitResponse(int topicPointer, int rating) {
        // Validation: Check for valid index (0 to topics.length-1) and valid rating (1 to 10)
        if (topicPointer >= 0 && topicPointer < topics.length && rating >= 1 && rating <= 10) {
            // Increment the counter in the responses array.
            // rating - 1 is used because column 0 holds the count for rating 1, etc.
            responses[topicPointer][rating - 1]++;

            // Add the rating to the total for this topic
            topicTotals[topicPointer] += rating;
            totalVotesProcessed++;
        }
    }

    //Generates and displays the final summary report of the survey results//
    public void generateReport() {

        if (totalVotesProcessed == 0) {
            System.out.println("\n--- No responses received. Report is null. ---");
            return;
        }

        // Variables to track the highest and lowest of the total scores
        int highestTotal = -1;
        String highestTopic = "";
        int lowestTotal = Integer.MAX_VALUE;
        String lowestTopic = "";

        System.out.println("\n==========================================================================================================");
        System.out.println("                                           SURVEY RESULTS REPORT");
        System.out.println("\n==========================================================================================================");
        // 1. Print the table header (Ratings 1 to 10)
        System.out.print("Topic                            \\Rating\t");
        for (int j = 1; j <= 10; j++) {
            System.out.printf("%4d", j); // Use %4d to align the ratings
        }
        // Print the 'Average'
        System.out.println("\t\tAverage");
        System.out.println("----------------------------------------------------------------------------------------------------------");



        // 2. Iterate over the topics (rows) to print the table and calculate averages/totals
        for (int i = 0; i < topics.length; i++) {
            // Print the topic name (left column)
            System.out.printf("%-12s\t", topics[i].substring(0, Math.min(10, topics[i].length())));

            int votesForCurrentTopic = 0;
            // Print the number of ratings received for each topic/rating
            for (int j = 0; j < 10; j++) {
                System.out.printf("%4d", responses[i][j]);
                votesForCurrentTopic += responses[i][j];
            }

            // Calculate and print the average for the row
            double average = 0.0;
            if (votesForCurrentTopic > 0) {
                // Average = (Sum of ratings / Number of voters)
                average = (double) topicTotals[i] / votesForCurrentTopic;
            }
            System.out.printf("\t\t%.2f", average);
            System.out.println(); // New line after printing the topic row

            // Check for highest and lowest total scores
            int currentTotal = topicTotals[i];

            // For the highest total
            if (currentTotal > highestTotal) {
                highestTotal = currentTotal;
                highestTopic = topics[i];
            }

            // For the lowest total
            if (currentTotal < lowestTotal) {
                lowestTotal = currentTotal;
                lowestTopic = topics[i];
            }
        }

        System.out.println("----------------------------------------------------------------------------------------------------------");
        // 3. Print the issue with the highest total score
        System.out.printf("Issue with the HIGHEST POINT TOTAL: %s (Total: %d)\n", highestTopic, highestTotal);
        // 4. Print the issue with the lowest total score
        System.out.printf("Issue with the LOWEST POINT TOTAL: %s (Total: %d)\n", lowestTopic, lowestTotal);
    }
}
