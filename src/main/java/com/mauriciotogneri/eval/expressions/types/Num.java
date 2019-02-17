package com.mauriciotogneri.eval.expressions.types;

import com.mauriciotogneri.eval.expressions.lib.Expression;

public class Num implements Expression<Number>
{
    private final double n;

    public Num(double n)
    {
        this.n = n;
    }

    @Override
    public Number eval()
    {
        return n;
    }
}