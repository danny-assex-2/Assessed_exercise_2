//Software Development - Programming
//Assignment 2
//Matriculation Number: 0801323
class Column {
    private int numRows;
    private Counter[] counters;
    private int current;

    Counter[] getCounters() {
        return counters;
    }

    Column(int numRows){
        this.numRows = numRows;
        this.counters = new Counter[numRows];
        this.current = numRows - 1;
    }

    int getNumRows() {
        return numRows;

    }

    boolean isFull(){
        if(counters[0] != null){
            return true;}
        else{return false;}
    }

    boolean add(Counter counter){
        if (!isFull()){
            counters[current] = counter;
            current--;
            return true;
        }
        else{return false;}
    }
    String displayRow(int rowNumber){
        if(counters[rowNumber] == null){
            return " ";
        }
        else{
        return counters[rowNumber].toString();
        }
    }

    public void display(){
        for(int i=0; i<counters.length; i++){
            System.out.println(counters[i]);}

        }
    }





