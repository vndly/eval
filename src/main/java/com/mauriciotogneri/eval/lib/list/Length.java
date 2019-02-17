package com.mauriciotogneri.eval.lib.list;

import com.mauriciotogneri.eval.lib.Expression;
import com.mauriciotogneri.eval.types.Seq;

public class Length implements Expression<Number>
{
    private final Seq<?, ?> l;

    public Length(Seq<?, ?> l)
    {
        this.l = l;
    }

    @Override
    public Number eval()
    {
        return l.size();
    }
}