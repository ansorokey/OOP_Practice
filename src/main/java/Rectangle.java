public class Rectangle extends Shape{
     protected double width;
     protected double height;

     Rectangle(){}

     Rectangle(double width, double height){
         this.width = width;
         this.height = height;
     }

     public double getWidth(){
         return this.width;
     }

     public double getHeight(){
         return this.height;
     }
     public double getArea(){
         return this.width * this.height;
     }
     @Override
     public double getPerimeter(){
         return ((width * 2) + (height * 2));
     }

     public double getDiagonal(){
         double a = this.width;
         double b = this.height;
         double c = Math.sqrt((a * a) + (b * b));
         return c;
     }
    @Override
    public String toString(){
        return "A rectangle with a width of " + this.width + " and a length of "  + this.height + ", which is a subclass of " + super.toString();
    }
}
