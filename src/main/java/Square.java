public class Square extends Rectangle{
    Square(double side){
        this.width = this.height = side;
    }
    Square(double width, double height){
        this.width = width;
        this.height = height;
    }
    public boolean isSquare(){
        return (this.width == this.height);
    }
    @Override
    public String toString(){
        return "A square with sides of "  + width + ", which is a sublcass of " + super.toString();
    }

}
