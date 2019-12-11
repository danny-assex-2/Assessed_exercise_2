//Software Development - Programming
//Assignment 2
//Matriculation Number: 0801323

public class Counter {
    private Player playerObj;


    Player getPlayer() {
        //getter for Counter
        return playerObj;
    }

    public String toString() {
        //I feel like there must be a better way of doing this.
        return Character.toString(playerObj.symb);
    }

    Counter(Player playerObj) {
        //Constructor
        this.playerObj = playerObj;
    }

    public boolean equals(Object o) {
        //initial type check to discount outright, then check if same player.
        if (!(o instanceof Counter)) {
            return false;
        }
        else {
            Counter other = (Counter) o;
            return getPlayer() == other.getPlayer();
        }

    }
}


