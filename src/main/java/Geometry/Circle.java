import java.lang

public  class  Circle implements Geometry{
    private double radius;
	public Circle(radius){
        this.radius = radius;
    }
    public  double  getArea(){
        return Math.PI*this.radius*this.radius;
    }
    public  double  getPerimeter(){
        return 2*Math.PI*this.radius;
    }
}
