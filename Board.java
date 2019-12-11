//Software Development - Programming
//Assignment 2
//Matriculation Number: 0801323

public class Board {
    private int numRows;
    private int numCols;
    private Column[] playBoard;


    int getNumCols() {
        return numCols;
    }


    Column[] getPlayBoard() {
        return playBoard;
    }

    Board(int numRows, int numCols) {
        //Constructor
        this.numRows = numRows;
        this.numCols = numCols;
        Column[] playBoard = new Column[numCols];
        //Fill up column array with empty columns
        for (int i = 0; i < numCols; i++) {
            playBoard[i] = new Column(numRows);
        }
        //I just want to share the fact that I spent five hours coming to the realisation
        // that I needed the below line of code
        this.playBoard = playBoard;
    }



    boolean add(Counter currentCounter, int colNumber) {
        //This is weird cos the boolean-ness of this never seems to be used in the main method...
        if (playBoard[colNumber].isFull()){
            return false;
    }else{
        playBoard[colNumber].add(currentCounter);
        return true;}
    }

    public String toString(){
        //This is very messy. I can only apologise.
        String s = "|";

        for(int i = 0; i < numCols; i++){
            s = s + i + "|";
        }
        s = s + "\n";
        for(int i = 0; i < numCols; i++){
            s = s + "--";
        }
        s = s+"\n";
        for(int i = 0; i < numRows; i++){
            s = s + "|";
            for(int j = 0; j < numCols; j++){
                s = s + playBoard[j].displayRow(i) + "|";
            }
            s = s+"\n";
        }
        return s;
    }
    boolean isFull(){
        //increment counter for each column if full.
        // if sum of counter == number of columns then return True
        int count = 0;
        for(int i = 0; i < playBoard.length; i++){
            if (playBoard[i].isFull()){
                count++;
            }
        }
        if (count == playBoard.length) {
            return true;
        }else{return false;}
        }
    }












