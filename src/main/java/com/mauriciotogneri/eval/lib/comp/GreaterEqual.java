package com.mauriciotogneri.eval.lib.comp;

import com.mauriciotogneri.eval.lib.Expression;

public class GreaterEqual implements Expression<Boolean>
{
    private final Expression<Number> a;
    private final Expression<Number> b;

    public GreaterEqual(Expression<Number> a, Expression<Number> b)
    {
        this.a = a;
        this.b = b;
    }

    @Override
    public Boolean eval()
    {
        return a.eval().doubleValue() >= b.eval().doubleValue();
    }
}