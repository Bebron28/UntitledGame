import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Engine {

    private int screenWidth = 800;
    private int screenHeight = 600;
    private final List<GameObject> objects = new ArrayList<>();
    private final Random random = new Random();

    public Engine() {
        objects.add(new GameObject(0, 0, 100, 50, 2, Color.RED));
        objects.add(new GameObject(1, 0, 200, 30, 4, Color.BLUE));
        objects.add(new GameObject(2, 0, 300, 60, 1, Color.GREEN));
    }

    public void update(float deltaTime) {
    }

    public void draw(Graphics g) {
    }

    public void spawnObject() {
    }

    public void spawnObject(GameObject gameObject) {
    }

    public boolean collisionAABB(GameObject a, GameObject b) {
        return false;
    }

    public void spawnObjectPattern(List<GameObject> pattern, long delay) {
    }

    // supplier of Pythagoras
    public void moveTowards(GameObject attaker, GameObject target) {
    }

    public List<GameObject> getObjects() {
        return new ArrayList<>(objects);
    }

    public void clearObjects() {
        objects.clear();
    }


}
