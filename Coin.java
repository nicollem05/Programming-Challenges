import java.util.Random;

public class Coin {

    // Create variables and a random to simulate 1 or 0
    private String sideUp;    // save the current state: "heads" or "tails"
    private Random random;    // Random object must be a field so 'toss' can use it


    public Coin() {
        // Initialize the Random object
        this.random = new Random();
        // Call toss to set the initial sideUp value
        toss();
    }

    //Simulates the coin toss, setting a new random sideUp value.
    public void toss(){
        if (this.random.nextInt(2) == 0){
            this.sideUp = "head";
        } else {
            this.sideUp = "tail";
        }
    }
    // we need the get to show the value
    public String getSideUp(){
        return this.sideUp;
    }
}
