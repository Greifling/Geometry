public  class  Square implements Geometry{
    private double length;
	public Square(double length){
        this.length = length;
    }
    public  double  getArea(){
        return this.length*this.length;
    }
    public  double  getPerimeter(){
        return this.length*4;
    }
}
