public class Agent {
  private int health;
  private String name;
  private int pos_x;
  private int pos_y;

  public Agent() {
  }

  public Agent(String name, int health) {
    this.name = name;
    this.health = health;
  }

  public void SetPos(int x, int y) {
    this.pos_x = x;
    this.pos_y = y;
  }

  public int GetPos() {
    return this.pos_x + this.pos_y;
  }

  public void Info() {
    System.out.print("Name: " + this.name);
    System.out.println("\tHealth: " + this.health);
  }
}
