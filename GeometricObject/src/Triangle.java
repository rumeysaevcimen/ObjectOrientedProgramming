public class Triangle extends GeometricObject{
    private double side1;
    private double side2;
    private double side3;


    public Triangle(){}
    public Triangle(int i, double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(double side1, double side2, double side3, String color, boolean filled){
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getArea() {
        double s = (side1 + side2 + side3) / 2 ;
        return Math.sqrt((s * (s - side1) * (s - side2) * (s - side3)));
    }

    public double getParameter() {
        return side1 + side2 + side3;

    }

    public String toString() {
        return "Üçgen: side1 = : " + getSide1() + "\n Side2: " + getSide2() + "\n Side3: " + getSide3() + "\n Alan: " + getArea() + "\n Çevre: " + getParameter();
    }
}
