package ru.stqa.pft.Lesson5;

public class MyFirstProgram {
    public static void main(String[] args) {

      hello("Alex");
      hello("Nikolay");
      hello("Denis");

        Square s = new Square(5);//Для квадрата
        System.out.println("Площадь квардрата со стороной " + s.l + " * "+ s.l + " = " + s.area());

        Rectangle r = new Rectangle(5,6);
        System.out.println("Площадь квардрата со стороной " + r.a + " и " + r.b + " = " + r.prem());
    }

    public static void hello(String somebody) {
        System.out.println("hello world " + somebody + "! ");
    }
}