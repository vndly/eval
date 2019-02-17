package com.mauriciotogneri.eval.expressions;

public class Sub implements Expression<Num>
{
    private final Expression<Num> a;
    private final Expression<Num> b;

    public Sub(Expression<Num> a, Expression<Num> b)
    {
        this.a = a;
        this.b = b;
    }

    @Override
    public Num eval()
    {
        return new Num(a.eval().value() - b.eval().value());
    }
}