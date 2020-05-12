package WarmUp;
/*
Task02:
    Create a class called Circle
            instance variables:
                    radius, pi, diameter
            add a constructor that can initialize the radius of the circle
            instance methods:
                    area(): can return the area of the circle as double
                    perimeter(): cna return the perimeter of the circle as double
                    toString(): returns the info of the circle
            Note: global value of PI is 3.14
                  diameter of circle = 2 * radius
                  area of circle = PI * r * r

 */


import java.text.DecimalFormat;

public class Circle
{
    double radius;
    double diameter;
    static double pi = 3.14;

    public Circle(double radius, double diameter) {
        this.radius = radius;
        this.diameter = diameter;
    }

    public double area() {
        return pi*radius*radius;
    }

    public float perimeter() {
        return 2*(float)pi*(float)radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                '}';
    }
}
class object {
    public static void main(String[] args) {
        Circle obj = new Circle(3.5, 5.2);

        System.out.printf("Perimeter: %.2f", obj.perimeter());
        System.out.println();
        DecimalFormat df = new DecimalFormat("0.000");
        System.out.println(df.format(obj.area()));
    }
}
