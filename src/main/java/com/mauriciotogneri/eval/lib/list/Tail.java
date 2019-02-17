package com.mauriciotogneri.eval.lib.list;

import com.mauriciotogneri.eval.lib.Expression;
import com.mauriciotogneri.eval.types.Seq;

public class Tail<R, T extends Expression<R>> implements Expression<R[]>
{
    private final Seq<R, T> s;

    public Tail(Seq<R, T> s)
    {
        this.s = s;
    }

    @Override
    @SuppressWarnings("unchecked")
    public R[] eval()
    {
        if (s.empty())
        {
            throw new RuntimeException("Cannot get tail of empty list");
        }

        Object[] result = new Object[s.size() - 1];

        for (int i = 1; i < s.size(); i++)
        {
            result[i - 1] = s.get(i).eval();
        }

        return (R[]) result;
    }
}