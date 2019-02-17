package com.mauriciotogneri.eval.test.lib;

import com.mauriciotogneri.eval.lib.comp.Equal;
import com.mauriciotogneri.eval.lib.comp.GreaterEqual;
import com.mauriciotogneri.eval.lib.comp.GreaterThan;
import com.mauriciotogneri.eval.lib.comp.LessEqual;
import com.mauriciotogneri.eval.lib.comp.LessThan;
import com.mauriciotogneri.eval.lib.comp.NotEqual;
import com.mauriciotogneri.eval.types.Num;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CompTest
{
    @Test
    public void equal()
    {
        Equal equal = new Equal(new Num(3), new Num(4));

        assertEquals(false, equal.eval());
    }

    @Test
    public void notEqual()
    {
        NotEqual notEqual = new NotEqual(new Num(3), new Num(4));

        assertEquals(true, notEqual.eval());
    }

    @Test
    public void lessThan()
    {
        LessThan lessThan = new LessThan(new Num(3), new Num(4));

        assertEquals(true, lessThan.eval());
    }

    @Test
    public void lessEqual()
    {
        LessEqual lessEqual = new LessEqual(new Num(3), new Num(4));

        assertEquals(true, lessEqual.eval());
    }

    @Test
    public void greaterThan()
    {
        GreaterThan greaterThan = new GreaterThan(new Num(3), new Num(4));

        assertEquals(false, greaterThan.eval());
    }

    @Test
    public void greaterEqual()
    {
        GreaterEqual greaterEqual = new GreaterEqual(new Num(3), new Num(4));

        assertEquals(false, greaterEqual.eval());
    }
}