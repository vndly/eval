package com.mauriciotogneri.eval.test;

import com.mauriciotogneri.eval.test.expressions.Factorial;
import com.mauriciotogneri.eval.types.Num;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FactorialTest
{
    @Test
    public void factorial()
    {
        Factorial factorial = new Factorial(new Num(5));

        assertEquals(120d, factorial.eval());
    }
}