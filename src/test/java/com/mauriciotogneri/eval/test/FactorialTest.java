package com.mauriciotogneri.eval.test;

import com.mauriciotogneri.eval.expressions.types.Num;
import com.mauriciotogneri.eval.test.expressions.Factorial;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FactorialTest
{
    @Test
    public void factorial()
    {
        Factorial factorial = new Factorial(new Num(5));
        Number result = factorial.eval();

        assertEquals(120.0, result);
    }
}