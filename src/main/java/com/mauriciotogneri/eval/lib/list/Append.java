package com.mauriciotogneri.eval.lib.list;

import com.mauriciotogneri.eval.lib.Expression;

public class Append<T> implements Expression<T[]>
{
    private final Expression<T> e;
    private final Expression<T>[] l;

    public Append(Expression<T> e, Expression<T>[] l)
    {
        this.e = e;
        this.l = l;
    }

    @Override
    @SuppressWarnings("unchecked")
    public T[] eval()
    {
        if (l.length == 0)
        {
            throw new RuntimeException("Cannot get head of empty list");
        }

        Object[] result = new Object[l.length + 1];
        result[0] = e.eval();

        for (int i = 0; i < l.length; i++)
        {
            result[i + 1] = l[i].eval();
        }

        return (T[]) result;
    }
}