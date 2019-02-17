package com.mauriciotogneri.eval.lib.math;

import com.mauriciotogneri.eval.lib.Expression;

public class Pow implements Expression<Number>
{
    private final Expression<Number> a;
    private final Expression<Number> b;

    public Pow(Expression<Number> a, Expression<Number> b)
    {
        this.a = a;
        this.b = b;
    }

    @Override
    public Number eval()
    {
        return Math.pow(a.eval().doubleValue(), b.eval().doubleValue());
    }
}