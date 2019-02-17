package com.mauriciotogneri.eval.lib.math;

import com.mauriciotogneri.eval.lib.Expression;

public class Mod implements Expression<Number>
{
    private final Expression<Number> a;
    private final Expression<Number> b;

    public Mod(Expression<Number> a, Expression<Number> b)
    {
        this.a = a;
        this.b = b;
    }

    @Override
    public Number eval()
    {
        return a.eval().doubleValue() % b.eval().doubleValue();
    }
}