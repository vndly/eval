package com.mauriciotogneri.eval.lib.list;

import com.mauriciotogneri.eval.lib.Expression;

public class Length<T> implements Expression<Number>
{
    private final Expression<T>[] l;

    public Length(Expression<T>[] l)
    {
        this.l = l;
    }

    @Override
    public Number eval()
    {
        return l.length;
    }
}