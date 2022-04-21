public class Circle extends Shape {
    protected final double pi = 3.1415;
    protected double width;
    protected double height;
    protected double radius;

    Circle(double width){
        this.width = this.height = width;
        this.radius = width / 2.0;
    }
    Circle(double width, double height){
        this.width = this.radius = width;
        this.height = height;
    }

    public double getWidth(){
        return  this.width;
    }

    public double getHeight(){
        return this.height;
    }


    @Override
    public double getArea() {
        return pi * width * width;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    public double getCircumference(){
        return 2.0 * pi * width;
    }

    public boolean isCircle(){
        return (this.width == this.height);
    }

    @Override
    public String toString(){
        return "A circle with a radius of " + this.radius + ", which is a subclass of " + super.toString();
    }

    public boolean isRectangle(){
        return (width != height);
    }

}
