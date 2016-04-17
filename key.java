
public class Key extends Control{
    public static Key up = new Key();
    public static Key down = new Key();
    public static Key right = new Key();
    public static Key left = new Key();

    public void toggle() {
      isDown =  !isDown;
    }

    public boolean isDown;
}
