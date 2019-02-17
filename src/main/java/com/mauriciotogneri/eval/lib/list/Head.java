package com.mauriciotogneri.eval.lib.list;

import com.mauriciotogneri.eval.lib.Expression;

public class Head<T> implements Expression<T>
{
    private final Expression<T>[] l;

    public Head(Expression<T>[] l)
    {
        this.l = l;
    }

    @Override
    public T eval()
    {
        if (l.length == 0)
        {
            throw new RuntimeException("Cannot get head of empty list");
        }

        return l[0].eval();
    }
}