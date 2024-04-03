package work1;

public class SquarePerimeter implements Perimeter{
    @Override
    public double calculatePerimeter(int sideOne, int sideTwo) {
        return (sideOne + sideTwo) * 2;
    }
}
