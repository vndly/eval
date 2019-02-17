package com.mauriciotogneri.eval.expressions;

public class Bool implements Expression
{
    private final boolean b;

    public Bool(boolean b)
    {
        this.b = b;
    }

    @Override
    public Bool eval()
    {
        return new Bool(b);
    }
}