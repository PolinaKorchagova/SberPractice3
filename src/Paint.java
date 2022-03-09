public class Paint {
public static void main(String[] args){
        Figure c = new Circle(new Point(0, 0), 14);
        Figure s = new Square(new Point(0, 1), 5);
        Figure r = new Rectangle(new Point(1, 0), 3, 4);
        Figure t = new Triangle(new Point(3, 2), 3, 4, 5);

        System.out.println("Площадь круга = " + FigureUtil.area(c));
        System.out.println("Площадь квадрата = " + FigureUtil.area(s));
        System.out.println("Площадь прямоугольника = " + FigureUtil.area(r));
        System.out.println("Площадь треугольника = " + FigureUtil.area(t));

        System.out.println("Периметр круга = " + FigureUtil.perimeter(c));
        System.out.println("Периметр квадрата = " + FigureUtil.perimeter(s));
        System.out.println("Периметр прямоугольника = " + FigureUtil.perimeter(r));
        System.out.println("Периметр треугольника = " + FigureUtil.perimeter(t));

        System.out.println();

        FigureUtil.draw(c);
        FigureUtil.draw(s);
        FigureUtil.draw(r);
        FigureUtil.draw(t);

        FigureUtil.draw(c, Color.Blue);
        FigureUtil.draw(s, Color.White);
        FigureUtil.draw(r, Color.Yellow);
        FigureUtil.draw(t, Color.Purple);
        }
        }