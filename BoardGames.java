public class BoardGames {

    private int numPlayers;
    private String nameOfGames;
    private double time;
    private boolean winner;

    public BoardGames(){

    }

    public void  BoardGames(int numPlayers, String nameOfGames, double time, boolean winner){
       this.numPlayers = numPlayers;
        this.nameOfGames = nameOfGames;
        this.time=time;
        this.winner= winner;

    }

    public int getNumPlayers() {
        return numPlayers;
    }

    public void setNumPlayers(int numPlayers) {
        this.numPlayers = numPlayers;
    }

    public String getNameOfGames() {
        return nameOfGames;
    }

    public void setNameOfGames(String nameOfGames) {
        this.nameOfGames = nameOfGames;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public boolean isWinner() {
        return winner;
    }

    public void setWinner(boolean winner) {
        this.winner = winner;
    }








}
