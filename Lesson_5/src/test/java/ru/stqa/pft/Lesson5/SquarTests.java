package ru.stqa.pft.Lesson18;

public class SquarTests {

    public void testArea() {
        Square s = new Square (5);
        assert s.area() == 25;
    }


    }

