package com.mauriciotogneri.eval.lib.cond;

import com.mauriciotogneri.eval.lib.Expression;

public class If<T> implements Expression<T>
{
    private final Expression<Boolean> a;
    private final Expression<T> b;
    private final Expression<T> c;

    public If(Expression<Boolean> a, Expression<T> b, Expression<T> c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public T eval()
    {
        return a.eval() ? b.eval() : c.eval();
    }
}