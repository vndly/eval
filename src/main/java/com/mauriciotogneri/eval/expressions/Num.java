package com.mauriciotogneri.eval.expressions;

public class Num implements Expression
{
    private final double n;

    public Num(double n)
    {
        this.n = n;
    }

    @Override
    public Double eval()
    {
        return n;
    }
}