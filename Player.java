//Software Development - Programming
//Assignment 2
//Matriculation Number: 0801323
public class Player {
    private String name;
    char symb;

    public char getSymb() {
        return symb;
    }

    public void setSymb(char symb) {
        this.symb = symb;
    }

    Player(String name, char symb){
        //constructor for Player
        this.name = name;
        this.symb = symb;
    }

    public String toString() {
        //toString method for name
        return this.getName();
    }

    private String getName() {
        //getter for name
        return name;
    }





}
