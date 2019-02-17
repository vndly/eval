package com.mauriciotogneri.eval.expressions;

public class Mul implements Expression
{
    private final Num a;
    private final Num b;

    public Mul(Num a, Num b)
    {
        this.a = a;
        this.b = b;
    }

    @Override
    public Num eval()
    {
        return new Num(a.eval() * b.eval());
    }
}