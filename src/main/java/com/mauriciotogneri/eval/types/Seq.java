package com.mauriciotogneri.eval.types;

import com.mauriciotogneri.eval.lib.Expression;

public class Seq<R, T extends Expression<R>> implements Expression<R[]>
{
    private final T[] s;

    public Seq(T... s)
    {
        this.s = s;
    }

    public T get(int index)
    {
        return s[index];
    }

    public boolean empty()
    {
        return (s.length == 0);
    }

    public int size()
    {
        return s.length;
    }

    @Override
    @SuppressWarnings("unchecked")
    public R[] eval()
    {
        Object[] result = new Object[s.length];

        for (int i = 0; i < s.length; i++)
        {
            result[i] = s[i].eval();
        }

        return (R[]) result;
    }
}