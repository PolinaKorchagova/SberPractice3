public class Triangle extends Figure{
private int a1;
private int a2;
private int a3;

public Triangle(Point point, int a1, int a2, int a3){
        super(point);
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
        }
@Override
public double area() {
        return Math.sqrt(perimeter()/2*(perimeter()/2-a1)*(perimeter()/2-a2)*(perimeter()/2-a3));
        }
@Override
public double perimeter() {
        return a1+a2+a3;
        }
@Override
public void draw() {
        draw(Color.Black);
        }
@Override
public void draw(Color color){
        Object point = null;
        System.out.println(String.format("Треугольник с координатой %s, сторонами %s, %s, %s и цветом %s%n", point, a1, a2, a3, color));
        }
        }