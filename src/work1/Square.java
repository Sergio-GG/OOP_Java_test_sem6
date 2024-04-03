package work1;

// 2-й принцип расширяемости за счет интерфейса.
// Квадрат
public class Square extends FourSidesFigure implements SquareInterface {

    Perimeter perimeter;

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public int square() {
        return height * height;
    }

    // 5-й принцип Dependency Inversion.
    public double calculateSquarePerimeter(){
        return perimeter.calculatePerimeter(height, height);
    }


}
