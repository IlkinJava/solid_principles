package l.good;

public class Square extends Rectangle {


    public Square(double side) {
        super(side, side);
    }


    public static void main(String[] args) {
        Square s = new Square(4);
        Rectangle r = new Rectangle(2, 5);
        System.out.println(s.area());
        System.out.println(r.area());
    }


}
