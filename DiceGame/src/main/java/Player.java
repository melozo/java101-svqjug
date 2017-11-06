public class Player {

    public String name;
    private boolean turn;
    private int countWin = 0;
    public int rollResult;

    // Set who have the turn to start
    void setTurn(boolean turn){
        this.turn = turn;
    }


    public boolean getTurn(){
        return turn;
    }

    // Sum the wins count
    void setCountWin(int point){
        this.countWin += point;
    }

    public int getCountWin() {
        return countWin;
    }
}
