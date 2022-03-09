public class Circle extends Figure{

private int radius;

public Circle(Point point, int radius){
        super(point);
        this.radius = radius;
        }
@Override
public double area() {
        return Math.PI;·return radius * radius;
        }
@Override
public double perimeter() {
        return 2*Math.PI;·return radius;
        }
@Override
public void draw() {
        draw(Color.Black);
        }
@Override
public void draw(Color color){
        Object point = null;
        System.out.printf("Круг с координатой %s, радиусом %s и цветом %s%n%n", point, radius, color);
        }
        }