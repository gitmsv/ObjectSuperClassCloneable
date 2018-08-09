package ua.jvdevpro.smlnk;

public class Main {

    public static void main(String[] args) {

        Rectangle a = new Rectangle(4, 5);
        //Rectangle b = new Rectangle(4, 5);

        // Копирование объекта а в объект с;
        Rectangle c = a.clone();

        // Изменение свойства объекта а;
        a.setLength(3);

        // Вывод на экран свойств объектов;
        System.out.println(a);
        System.out.println(c);
    }
}
