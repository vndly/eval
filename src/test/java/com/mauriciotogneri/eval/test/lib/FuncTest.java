package com.mauriciotogneri.eval.test.lib;

import com.mauriciotogneri.eval.lib.Expression;
import com.mauriciotogneri.eval.lib.func.Map;
import com.mauriciotogneri.eval.lib.math.Inc;
import com.mauriciotogneri.eval.types.Num;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class FuncTest
{
    @Test
    public void map()
    {
        IncExpression inc = Inc::new;

        Map map = new Map<>(new Num[] {new Num(1), new Num(2), new Num(3)}, num -> num.doubleValue() * 2);

        assertArrayEquals(new Number[] {2d, 4d, 6d}, map.eval());
    }

    public interface IncExpression
    {
        Inc create(Expression<Number> n);
    }
}