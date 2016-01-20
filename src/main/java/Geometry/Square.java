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
    public int compareTo(obj opposite){
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
