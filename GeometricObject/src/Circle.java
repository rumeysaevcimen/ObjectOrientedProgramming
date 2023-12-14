import java.security.PublicKey;

public class Circle extends GeometricObject{
    private double radius;
    public Circle(){}
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    
    public void setRadius(double radius){
        this.radius = radius;
    }
    
    public double getArea(){
        return radius * radius * Math.PI;
    }
    
    public double getDiameter(){
        return 2 * Math.PI * radius;
    }
    
    public void printCircle(){
        System.out.println("Çemberin oluşturulma tarihi: " + getDateCreated() + "\n Çemberin alanı: " + getArea() + "\n Çemberin çevresi: " + getDiameter());
    }
    
}
