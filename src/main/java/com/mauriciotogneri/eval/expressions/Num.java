package com.mauriciotogneri.eval.expressions;

public class Num implements Expression<Number>
{
    private final double n;

    public Num(double n)
    {
        this.n = n;
    }

    public double value()
    {
        return n;
    }

    @Override
    public Number eval()
    {
        return n;
    }
}