package com.mauriciotogneri.eval.lib.math;

import com.mauriciotogneri.eval.lib.Expression;

public class Inc implements Expression<Number>
{
    private final Expression<Number> a;

    public Inc(Expression<Number> a)
    {
        this.a = a;
    }

    @Override
    public Number eval()
    {
        return a.eval().doubleValue() + 1;
    }
}