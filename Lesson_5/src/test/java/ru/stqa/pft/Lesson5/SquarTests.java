package ru.stqa.pft.Lesson5;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SquarTests {

    @Test
    public void testArea() {
        Square s = new Square (5);
        Assert.assertEquals(s.area(), 25.0);
    }
    }

