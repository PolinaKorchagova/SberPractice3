public class Point {
        public double x;
        public double y;
        public Point(double X, double Y)
        {
            x = X;
            y = Y;
        }
        public abstract class Figure {
            public double S;
            public double P;
            public double area() {return S;}
            public double perimeter() {return P;}
        }
    }
    classCircle extends Point{
        class Circle implements Drawable{};
    }
    classSquare extends Rectangle{
        class Square implements Drawable{};
    }
    classRectangle extends Point{
        class Rectangle implements Drawable{};
    }
    classTriangle extends Point{
    }
    class Triangle implements Drawable{};
}
public interface {
        void draw(){};
        void draw(Color color) {};
        }
public class FigureUnit {
    privateclassFigure {
        Figure figure;
        public double area(Figure figure) {
            return S;}
        public double perimeter(Figure figure) {
            return P;}
        void draw(){
            System.out.println("(" + x + ", " + y + ") - Black");};
        void draw(Color color) {
            System.out.println(color);};
    }
}
    publicclassPaint{
        public static void main(String[] args){
            Point A = new Point(0, 0);
            Point B = new Point(1, 0);
            Point C = new Point(3, 1);
            Point D = new Point(0, 1);
            Point.Figure E = new Point.Figure();
            FigureUnit F = new FigureUnit();
        }
    }
}

}
