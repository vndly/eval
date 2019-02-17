package com.mauriciotogneri.eval.expressions;

public class If<T> implements Expression<T>
{
    private final Expression<Bool> a;
    private final Expression<T> b;
    private final Expression<T> c;

    public If(Expression<Bool> a, Expression<T> b, Expression<T> c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public T eval()
    {
        return a.eval().value() ? b.eval() : c.eval();
    }
}