package com.mauriciotogneri.eval.lib.math;

import com.mauriciotogneri.eval.lib.Expression;

public class Add implements Expression<Number>
{
    private final Expression<Number> a;
    private final Expression<Number> b;

    public Add(Expression<Number> a, Expression<Number> b)
    {
        this.a = a;
        this.b = b;
    }

    @Override
    public Number eval()
    {
        return a.eval().doubleValue() + b.eval().doubleValue();
    }
}