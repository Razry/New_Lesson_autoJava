package ru.stqa.pft.Lesson5;

import org.testng.annotations.Test;

public class SquarTests {

    @Test
    public void testArea() {
        Square s = new Square (5);
        assert s.area() == 25;
    }


    }

