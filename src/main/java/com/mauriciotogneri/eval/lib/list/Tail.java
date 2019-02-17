package com.mauriciotogneri.eval.lib.list;

import com.mauriciotogneri.eval.lib.Expression;

public class Tail<T> implements Expression<T[]>
{
    private final Expression<T>[] l;

    public Tail(Expression<T>[] l)
    {
        this.l = l;
    }

    @Override
    @SuppressWarnings("unchecked")
    public T[] eval()
    {
        if (l.length == 0)
        {
            throw new RuntimeException("Cannot get tail of empty list");
        }

        Object[] result = new Object[l.length - 1];

        for (int i = 1; i < l.length; i++)
        {
            result[i - 1] = l[i].eval();
        }

        return (T[]) result;
    }
}