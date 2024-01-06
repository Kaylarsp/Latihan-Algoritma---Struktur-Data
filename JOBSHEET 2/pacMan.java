public class pacMan {
    int x, y, width, height;

    void moveLeft() {
        if (x >= 0 || x < width) {
            x = x - 1;
        } else {
            System.out.println("Error");
        }
    }

    void moveRight() {
        if (x >= 0 || x < width) {
            x = x + 1;
        } else {
            System.out.println("Error");
        }
    }

    void moveUp() {
        if (y >= 0 || y < height) {
            y = y - 1;
        } else {
            System.out.println("Error");
        }
    }

    void moveDown() {
        if (y >= 0 || y < height) {
            y = y + 1;
        } else {
            System.out.println("Error");
        }
    }
}
