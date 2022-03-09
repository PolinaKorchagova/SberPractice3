public class Rectangle extends Figure{
        private final int height;
        int width;
public Rectangle(Point point, int width, int height){
        super(point);
        this.height = height;
        this.width = width;
        }
@Override
public double area() {
        return width * height;
        }
@Override
public double perimeter() {
        return 2 * (width + height);
        }
@Override
public void draw() {
        draw(Color.Black);
        }
@Override
public void draw(Color color){
        System.out.println(String.format("Прямоугольник с координатой %s, шириной %s, высотой %s и цветом %s%n", point, width, height, color));
        }
}