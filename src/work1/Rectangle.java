package work1;

// 3-й принцип Барбары Лисков. В прямоугольнике появляется значение еще одной стороны,
// которое не нужно квадрату.
// Прямоугольник
public class Rectangle extends FourSidesFigure{
    int width;

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
