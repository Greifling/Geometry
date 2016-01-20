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
}
