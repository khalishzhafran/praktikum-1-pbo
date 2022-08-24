public class Player {
  private int direction;
  private int id;
  private int strength;

  public Player() {
  }

  public Player(int id, int direction) {
    this.id = id;
    this.direction = direction;
  }

  public void AddStrength(int str) {
    this.strength += str;
  }

  public void InfoPlayer() {
    System.out.print("Player id: " + this.id);
    System.out.println("\tDirection: " + this.direction);
  }
}
