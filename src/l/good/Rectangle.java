package l.good;

/**
 * L
 * Принцип подстановки Барбары Лисков (The Liskov Substitution Principle)
 * «объекты в программе должны быть заменяемыми на экземпляры их подтипов без изменения правильности выполнения программы.» См. также контрактное программирование.
 * Наследующий класс должен дополнять, а не изменять базовый.
 */
public class Rectangle {

    private double width;
    private double height;


    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }


    public double getWidth() {
        return width;
    }


    public double getHeight() {
        return height;
    }


    public double area() {
        return width * height;
    }

}
