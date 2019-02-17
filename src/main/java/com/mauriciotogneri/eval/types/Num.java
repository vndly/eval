package com.mauriciotogneri.eval.types;

import com.mauriciotogneri.eval.lib.Expression;

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