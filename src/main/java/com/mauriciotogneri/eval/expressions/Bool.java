package com.mauriciotogneri.eval.expressions;

public class Bool implements Expression<Bool>
{
    private final boolean b;

    public Bool(boolean b)
    {
        this.b = b;
    }

    public boolean value()
    {
        return b;
    }

    @Override
    public Bool eval()
    {
        return new Bool(b);
    }
}