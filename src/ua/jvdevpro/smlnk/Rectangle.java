package ua.jvdevpro.smlnk;

public class Rectangle implements Cloneable {
    private double length;
    private double width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWedht() {
        return width;
    }

    public void setWedht(double width) {
        this.width = width;
    }


    Rectangle(double length, double wedht) {
        this.length = length;
        this.width = wedht;
    }

    Rectangle() {
        super();
    }

    @Override
    public String toString() {
        return ("Rectangle: " + "length = " + length + " , " + "width = " + width);
    }

    @Override
    public void finalize() {
        System.out.println("Rectange destroed!!");
    }

    // Переопределенный метод equals() для сравнения по содержимому;

    @Override
    public boolean equals(Object a) {
        if (this == a) return true;
        else if (a == null) return false;
        else if (this.getClass() != a.getClass()) return false;
        Rectangle b = (Rectangle) a;
        if ((b.length == this.length) && (b.width == this.width)) return true;
        else return false;
    }

    // Переопределение метода clone();

    public Rectangle clone() {
        try {
            return (Rectangle) super.clone(); // Использование метода суперкласса Object;
        } catch (CloneNotSupportedException e) { // Исключение, которое может вызвать метод;
            return null;
        }
    }
}