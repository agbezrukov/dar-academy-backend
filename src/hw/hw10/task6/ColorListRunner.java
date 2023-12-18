package hw.hw10.task6;

public class ColorListRunner {
    public static void main(String[] args) {

        ColorList colorList = new ColorList();
        colorList.putColorToList("White");
        colorList.putColorToList("Black");
        colorList.putColorToList("Green");

        colorList.printColorList();
    }
}
