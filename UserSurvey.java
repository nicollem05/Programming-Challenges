import java.util.Scanner;
public class UserSurvey {
 public static void main(String [] args ){
     //Put the five subjects use in the survey
     String[] topics={
             "Climatic Change",
             "Woman Rights",
             "Economy",
             "Emigrants Rights",
             "Political money and how is use"
     };
     //Create a counter object
     Survey collector = new Survey(topics);
     Scanner scanner = new Scanner(System.in);

     System.out.print("How many people is going to do the survey?");
     int numPeople = scanner.nextInt();

     // Run the data per each person
     for(int p = 0 ; p < numPeople ; p++){
         System.out.printf("\n--- Person #%d ---\n", p + 1);
         for (int i = 0; i < topics.length; i++) {
             int rating = -1;
             // Imput and validation of data
             while (rating < 1 || rating > 10) {
                 System.out.printf("Choose a value for '%s' in terms of 1-10 : ", topics[i]);
                 if (scanner.hasNextInt()) {
                     rating = scanner.nextInt();
                 } else {
                     scanner.next(); // Do not take values if is not valid
                 }
             }

             // Usar el objeto SurveyCollector para registrar la respuesta
             collector.submitResponse(i, rating);
         }
     }

     // Generar y mostrar el reporte final
     collector.generateReport();
     scanner.close();
 }
}
//Example of the results give for the program
/*--- Person #1 ---
Choose a value for 'Climatic Change' in terms of 1-10 : 2
Choose a value for 'Woman Rights' in terms of 1-10 : 5
Choose a value for 'Economy' in terms of 1-10 : 45
Choose a value for 'Economy' in terms of 1-10 : 4
Choose a value for 'Emigrants Rights' in terms of 1-10 : 5
Choose a value for 'Political money and how is use' in terms of 1-10 : 2

        --- Person #2 ---
Choose a value for 'Climatic Change' in terms of 1-10 : 4
Choose a value for 'Woman Rights' in terms of 1-10 : 4
Choose a value for 'Economy' in terms of 1-10 : 4
Choose a value for 'Emigrants Rights' in terms of 1-10 : 4
Choose a value for 'Political money and how is use' in terms of 1-10 : 7

        ==========================================================================================================
SURVEY RESULTS REPORT
==========================================================================================================
Topic                            \Rating	   1   2   3   4   5   6   7   8   9  10		Average
----------------------------------------------------------------------------------------------------------
Climatic C  	   0   1   0   1   0   0   0   0   0   0		3.00
Woman Righ  	   0   0   0   1   1   0   0   0   0   0		4.50
Economy     	   0   0   0   2   0   0   0   0   0   0		4.00
Emigrants   	   0   0   0   1   1   0   0   0   0   0		4.50
Political   	   0   1   0   0   0   0   1   0   0   0		4.50
        ----------------------------------------------------------------------------------------------------------
Issue with the HIGHEST POINT TOTAL: Woman Rights (Total: 9)
Issue with the LOWEST POINT TOTAL: Climatic Change (Total: 6)*/


