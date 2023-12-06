package hw.hw9.basic.task2;

public class StarTriangle {

    private int width;

    public StarTriangle(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        StringBuilder triangleStr = new StringBuilder();
        for (int i = 1; i <= width; i++) {
            for (int j = 0; j < i; j++) {
                triangleStr.append('*');
            }
            triangleStr.append('\n');
        }
        return triangleStr.toString();
    }
}
