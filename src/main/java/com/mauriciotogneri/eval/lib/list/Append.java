package com.mauriciotogneri.eval.lib.list;

import com.mauriciotogneri.eval.lib.Expression;
import com.mauriciotogneri.eval.types.Seq;

public class Append<R, T extends Expression<R>> implements Expression<R[]>
{
    private final T e;
    private final Seq<R, T> s;

    public Append(T e, Seq<R, T> s)
    {
        this.e = e;
        this.s = s;
    }

    @Override
    @SuppressWarnings("unchecked")
    public R[] eval()
    {
        if (s.empty())
        {
            throw new RuntimeException("Cannot get head of empty list");
        }

        Object[] result = new Object[s.size() + 1];
        result[0] = e.eval();

        for (int i = 0; i < s.size(); i++)
        {
            result[i + 1] = s.get(i).eval();
        }

        return (R[]) result;
    }
}