package com.mauriciotogneri.eval.test.lib;

import com.mauriciotogneri.eval.lib.bool.Equal;
import com.mauriciotogneri.eval.lib.bool.Not;
import com.mauriciotogneri.eval.types.Bool;
import com.mauriciotogneri.eval.types.Num;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BoolTest
{
    @Test
    public void not()
    {
        Not not = new Not(new Bool(true));

        assertEquals(false, not.eval());
    }

    @Test
    public void equal()
    {
        Equal equal = new Equal(new Num(3), new Num(3));

        assertEquals(true, equal.eval());
    }
}