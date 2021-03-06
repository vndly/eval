package com.mauriciotogneri.eval.lib.comp;

import com.mauriciotogneri.eval.lib.Expression;

public class NotEqual implements Expression<Boolean>
{
    private final Expression<?> a;
    private final Expression<?> b;

    public NotEqual(Expression<?> a, Expression<?> b)
    {
        this.a = a;
        this.b = b;
    }

    @Override
    public Boolean eval()
    {
        return !a.eval().equals(b.eval());
    }
}