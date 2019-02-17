package com.mauriciotogneri.eval.test.lib;

import com.mauriciotogneri.eval.lib.bool.Not;
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
}