import com.java.game.Umpire;

public class Main {
    public static void main(String[] args)
    {
        Umpire umpire = new Umpire();
        umpire.collectNumberFromGuesser();
        umpire.collectNumberFromPlayers();
        umpire.compare();
    }
}