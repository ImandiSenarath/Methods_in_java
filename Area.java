//use methods
class Area {
    private double length;
    private double breadth;

    // Method to set the dimensions of the rectangle
    public void setDim(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate and return the area of the rectangle
    public double getArea() {
        return length * breadth;
    }

    public static void main(String[] args) {
        // Create an instance of the 'Area' class
        Area rectangle = new Area();

        // Set the dimensions
        double length = 5;
        double breadth = 10;
        rectangle.setDim(length, breadth);

        // Calculate and print the area
        double area = rectangle.getArea();
        System.out.println("Area of the rectangle: " + area);
    }
}