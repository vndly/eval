package com.mauriciotogneri.eval.lib.list;

import com.mauriciotogneri.eval.lib.Expression;
import com.mauriciotogneri.eval.types.Seq;

public class Head<R, T extends Expression<R>> implements Expression<R>
{
    private final Seq<R, T> s;

    public Head(Seq<R, T> s)
    {
        this.s = s;
    }

    @Override
    public R eval()
    {
        if (s.empty())
        {
            throw new RuntimeException("Cannot get head of empty list");
        }

        return s.get(0).eval();
    }
}