package com.mauriciotogneri.eval.test.lib;

import com.mauriciotogneri.eval.lib.math.Add;
import com.mauriciotogneri.eval.lib.math.Div;
import com.mauriciotogneri.eval.lib.math.Mul;
import com.mauriciotogneri.eval.lib.math.Sub;
import com.mauriciotogneri.eval.types.Num;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MathTest
{
    @Test
    public void add()
    {
        Add add = new Add(new Num(4), new Num(8));

        assertEquals(12d, add.eval());
    }

    @Test
    public void sub()
    {
        Sub sub = new Sub(new Num(4), new Num(8));

        assertEquals(-4d, sub.eval());
    }

    @Test
    public void mul()
    {
        Mul mul = new Mul(new Num(4), new Num(8));

        assertEquals(32d, mul.eval());
    }

    @Test
    public void div()
    {
        Div div = new Div(new Num(4), new Num(8));

        assertEquals(0.5d, div.eval());
    }
}