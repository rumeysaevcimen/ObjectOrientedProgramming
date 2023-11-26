public class Sheet {

    private final double width;
    private final double height;
    private final String name;

    public Sheet(double newWidth, double newHeight, String newName) {
        width = newWidth;
        height = newHeight;
        name = newName;
    }

    public Sheet cutInHalf() {
        double newWidth = width / 2;
        double newHeight = height / 2;
        String newName = "A1";
        return new Sheet(newWidth, newHeight, newName);
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Sheet sheet = new Sheet(841, 1189, "A0");

        System.out.println("Sheet width: " + sheet.getWidth());
        System.out.println("Sheet height: " + sheet.getHeight());
        System.out.println("Sheet name: " + sheet.getName());

        Sheet halfSheet = sheet.cutInHalf();

        System.out.println("Half sheet width: " + halfSheet.getWidth());
        System.out.println("Half sheet height: " + halfSheet.getHeight());
        System.out.println("Half sheet name: " + halfSheet.getName());
    }
}
