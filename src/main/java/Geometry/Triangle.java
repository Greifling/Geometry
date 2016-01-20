import java.lang.Math;

public  class  Triangle implements Geometry {
    private double length;
	public Triangle(double length){
        this.length = length;
    }
    public  double  getArea(){
        return (this.length*this.length*Math.sqrt(3)/4.0);
    }
    public  double  getPerimeter(){
        return this.length*3;
    }
    public int compareTo(object opposite){
        if ((this.getPerimeter() == opposite.getPerimeter())){
            if ((this.getPerimeter() == opposite.getArea())){
                return 0;
            }
            else {
                return (int)(this.getArea() - opposite.getArea());
            }
        }
        else{
            return (int)(this.getPerimeter() - opposite.getPerimeter());
        }
    }
}
