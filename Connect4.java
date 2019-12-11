//Software Development - Programming
//Assignment 2
//Matriculation Number: 0801323
import java.util.Random;

public class Connect4 {


    public static void main(String[] args) {
        System.out.println("Matriculation number: 0801323"+"\n");
        Player p1 = new Player("Clive",'o');
        Player p2 = new Player("Sharon",'x');
        Counter c = new Counter(p1);
        System.out.println("Test output for 1(c): ");
        System.out.println(c.getPlayer().toString() + ", " +
                c.toString());

//        The below code tests our .equals() boolean (uncomment to check)
//        Counter d = new Counter(p1);
//        Counter e = new Counter(p2);
//        System.out.println("Test of equality 1: Same player input: " + c.equals(d));
//        System.out.println("Test of equality 2: Different player input: " + c.equals(e));




//      Below test code is for 2(c) - Technically the output in the assignment is wrong:
//      The code suggests using System.out.println will produce "True, True, True, True, False" but this looks more like
//      the output from System.out.print. I have used System.out.println but am equally happy to use the alternative.

        Column col = new Column(4);
        System.out.println("\nTest output for 2(c):");
        for (int i=0; i<5; i++){
            Boolean result = col.add(new Counter(p1));
            System.out.println(result);
        }



//      Below test code is for 2(e)
        col = new Column(6);
        System.out.println("\nTest output for 2(e)");
        for(int i=0;i<3;i++) {
            col.add(new Counter(p1));
            col.add(new Counter(p2));
        }
        col.display();

//      Below test code is for 3(d). I have removed the Player definitions as they are already used above
        Board board = new Board(6,7);
        board.add(new Counter(p2),6);
        board.add(new Counter(p1),3);
        board.add(new Counter(p2),4);
        board.add(new Counter(p1),4);
        board.add(new Counter(p2),5);
        board.add(new Counter(p1),5);
        board.add(new Counter(p2),6);
        board.add(new Counter(p1),5);
        board.add(new Counter(p2),6);
        board.add(new Counter(p1),6);
        System.out.print("\n"+"Test output for 3(d): \n"+board.toString() + "\n");


//      Calling static method for playing randomly
        playRandom(new Board(4, 6), p1, p2);


    }

    private static void playRandom(Board board, Player player1, Player player2) {
        Random randomGen = new Random();
        int counter = 0;
        int colChoice;
        Player active = player1; //ensures player 1 plays first
        while (!board.isFull()) { //continue playing until board is full
            colChoice = randomGen.nextInt(board.getNumCols()); //randomly choose column
            if (board.getPlayBoard()[colChoice].isFull()) { //if column already full, switch to a different column
                while (board.getPlayBoard()[colChoice].isFull()) {
                    colChoice = randomGen.nextInt(board.getNumCols()); //new random column choice
                }
            }
            counter++; //increment to count moves
            board.add(new Counter(active), colChoice); //adds current char to board
            if (active.equals(player1)) {//switch players
                active = player2;
            }else {active = player1;
            }
        }

        System.out.print("Static method <playRandom> test: \n"+board.toString()); // prints the final board
        System.out.println("Game finished in "+ counter + " turns"); // shows the final number of turns



    }
}
