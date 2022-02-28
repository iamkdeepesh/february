class Circle {

    private int radius;

    public void setRadius(int radius) {
        
        this.radius = radius;
    }

    public double area() {
        
        return this.radius * this.radius * Math.PI;
    }
}

public class Methods {

    public static void main(String[] args) {
        
        Circle c = new Circle();
        c.setRadius(5);

        System.out.println(c.area());
    }
}