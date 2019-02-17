package com.mauriciotogneri.eval.test.lib;

import com.mauriciotogneri.eval.lib.math.Add;
import com.mauriciotogneri.eval.lib.math.Dec;
import com.mauriciotogneri.eval.lib.math.Div;
import com.mauriciotogneri.eval.lib.math.Inc;
import com.mauriciotogneri.eval.lib.math.Mod;
import com.mauriciotogneri.eval.lib.math.Mul;
import com.mauriciotogneri.eval.lib.math.Pow;
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

    @Test
    public void inc()
    {
        Inc inc = new Inc(new Num(4));

        assertEquals(5d, inc.eval());
    }

    @Test
    public void dec()
    {
        Dec dec = new Dec(new Num(4));

        assertEquals(3d, dec.eval());
    }

    @Test
    public void pow()
    {
        Pow pow = new Pow(new Num(4), new Num(8));

        assertEquals(65536d, pow.eval());
    }

    @Test
    public void mod()
    {
        Mod mod = new Mod(new Num(4), new Num(8));

        assertEquals(4d, mod.eval());
    }
}