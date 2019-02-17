package com.mauriciotogneri.eval.lib.bool;

import com.mauriciotogneri.eval.lib.Expression;

public class And implements Expression<Boolean>
{
    private final Expression<Boolean> a;
    private final Expression<Boolean> b;

    public And(Expression<Boolean> a, Expression<Boolean> b)
    {
        this.a = a;
        this.b = b;
    }

    @Override
    public Boolean eval()
    {
        return a.eval() && b.eval();
    }
}