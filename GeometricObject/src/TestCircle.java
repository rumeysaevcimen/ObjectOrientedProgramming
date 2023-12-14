public class TestCircle {
    public static void main(String[] args) {
        Circle cember01 = new Circle(1);
        System.out.println(cember01.toString());
        System.out.println(cember01.getDiameter());
        cember01.printCircle();
        displayObject(new Circle(3, "kırmızı", true));
        Rectangle rect01 = new Rectangle();
        System.out.println(rect01.toString());
        displayObject(new Rectangle(3, 5, "sarı", false));
        Triangle ucgen01 = new Triangle();

        System.out.println(ucgen01.toString());
        displayObject(new Triangle(1, 1, 5, 1));
        System.out.println((ucgen01.getArea()));
    }

    public static void displayObject(GeometricObject nesne){
        System.out.println("Oluşturulma tarihi: " + nesne.getDateCreated() +
                "\n Nesnenin rengi: " + nesne.getColor());
    }
}

//displayObject çoklu davraniş gösteren bir yöntem. Önemli!!! Polimorfik davranış!