package com.mauriciotogneri.eval.test.lib;

import com.mauriciotogneri.eval.lib.cond.If;
import com.mauriciotogneri.eval.types.Bool;
import com.mauriciotogneri.eval.types.Num;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CondTest
{
    @Test
    public void ifThenElse()
    {
        If ifThenElse = new If<>(new Bool(false), new Num(3), new Num(4));

        assertEquals(4d, ifThenElse.eval());
    }
}