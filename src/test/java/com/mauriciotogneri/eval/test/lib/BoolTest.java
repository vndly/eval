package com.mauriciotogneri.eval.test.lib;

import com.mauriciotogneri.eval.lib.bool.And;
import com.mauriciotogneri.eval.lib.bool.Not;
import com.mauriciotogneri.eval.lib.bool.Or;
import com.mauriciotogneri.eval.types.Bool;

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
    public void and()
    {
        And and = new And(new Bool(true), new Bool(false));

        assertEquals(false, and.eval());
    }

    @Test
    public void or()
    {
        Or or = new Or(new Bool(true), new Bool(false));

        assertEquals(true, or.eval());
    }
}