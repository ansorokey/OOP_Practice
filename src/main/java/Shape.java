public abstract class Shape {
    protected String color;
    protected boolean filled;

    Shape(){
        this.color = "green";
        this.filled = true;
    }

    Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public String getColor(){
        return this.color;
    }

    public boolean getFILLED(){
        return this.filled;
    }

    public String toString(){
        String filledOrNot;
        if(this.filled){
            filledOrNot = "filled.";
        } else {
            filledOrNot = "not filled";
        }
        return "A shape with color of " + this.color + " and " + filledOrNot;
    }




}
