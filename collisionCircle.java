
/* This method must be added to the engine class.
public boolean collisionCircle(GameObject a, GameObject b) {
    float radiusA = a.getSize() / 2f;
    float radiusB = b.getSize() / 2f;

    float deltax = a.getX() - b.getX();
    float deltay = a.getY() - b.getY();
    float distance = (float) Math.sqrt(deltax * deltax + deltay * deltay);

    return distance < radiusA + radiusB;
}
*/