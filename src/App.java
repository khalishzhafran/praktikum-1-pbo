public class App {
  public static void main(String[] args) {
    Agent agent1 = new Agent();
    Agent agent2 = new Agent("Khalish", 100);
    Player player1 = new Player();
    Player player2 = new Player(7, 1);

    agent1.Info();
    agent2.Info();
    System.out.println("============================");
    player1.InfoPlayer();
    player2.InfoPlayer();
  }
}
