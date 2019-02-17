package com.mauriciotogneri.eval.types;

import com.mauriciotogneri.eval.lib.Expression;

public class Bool implements Expression<Boolean>
{
    private final boolean b;

    public Bool(boolean b)
    {
        this.b = b;
    }

    @Override
    public Boolean eval()
    {
        return b;
    }
}