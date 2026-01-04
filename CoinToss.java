public class CoinToss {
    public static void main (String [] args){
        // we create a Coin with the class Coin
        Coin theCoin = new Coin();

        //we need to show the upside of the coin at the beginning
        System.out.printf("We are going to play to flip a coin.\n");
        System.out.printf("The coin start at: %s\n",theCoin.getSideUp());

        //We need to count the results and we iniciallized in  0
        int headCount=0;
        int tailCount=0;

        // we need to make that the program starts with the coin in head side
        if(theCoin.getSideUp().equals("head")){
            headCount++;
        }else{
            tailCount++;
        }
        System.out.println("Start simulation of 20 times toss: ");

        // we create a for cycle

        for(int i = 0; i<=20; i++){
            theCoin.toss();
            String currentSide= theCoin.getSideUp();
        // we need to show the side that is up and upload the value every time
            System.out.printf("toss %2d: %s\n",i, currentSide);

            if(currentSide.equals("head")){
                headCount++;
            }else{
                tailCount++;
            }
        }
        //we need to show the results

        System.out.println("The final results of the simulation are");
        System.out.printf("Total de 'heads': %d\n", headCount);
        System.out.printf("Total de 'tails': %d\n", tailCount);
        System.out.printf("Total of toss: %d\n", headCount + tailCount);

    }
}

//The return of a test must be We are going to play to flip a coin.
//The coin start at: tail
//Start simulation of 20 times toss
//toss  0: head
//toss  1: head
//toss  2: head
//toss  3: head
//toss  4: head
//toss  5: head
//toss  6: head
//toss  7: tail
//toss  8: tail
//toss  9: head
//toss 10: tail
//toss 11: tail
//toss 12: head
//toss 13: head
//toss 14: head
//toss 15: head
//toss 16: head
//toss 17: tail
//toss 18: head
//toss 19: head
//toss 20: tail
//The final results of the simulation are
//Total de 'heads': 15
//Total de 'tails': 7
//Total of toss: 22
