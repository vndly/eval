package com.mauriciotogneri.eval.lib.bool;

import com.mauriciotogneri.eval.lib.Expression;

public class Not implements Expression<Boolean>
{
    private final Expression<Boolean> a;

    public Not(Expression<Boolean> a)
    {
        this.a = a;
    }

    @Override
    public Boolean eval()
    {
        return !a.eval();
    }
}