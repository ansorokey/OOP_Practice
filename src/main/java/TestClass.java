public class TestClass {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0, 5.0);
        Rectangle rectangle = new Rectangle(4.0,3.0);
        Square square = new Square(5.0);

        System.out.println(circle.getCircumference());
        System.out.println(circle.getPerimeter());
        System.out.println(circle.isCircle());
        System.out.println(circle.getArea());
        System.out.println(circle.toString());
        System.out.println();
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getDiagonal());
        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.toString());
        System.out.println();
        System.out.println(square.isSquare());
        System.out.println(square.toString());
        System.out.println(square.getDiagonal());

    }
}
