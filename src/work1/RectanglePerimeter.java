package work1;

public class RectanglePerimeter implements Perimeter{
    @Override
    public double calculatePerimeter(int sideOne, int sideTwo) {
        return (sideOne + sideTwo) * 2;
    }
}
