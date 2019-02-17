package com.mauriciotogneri.eval.expressions;

public class Equal implements Expression
{
    private final Expression a;
    private final Expression b;

    public Equal(Expression a, Expression b)
    {
        this.a = a;
        this.b = b;
    }

    @Override
    public Object eval()
    {
        return a.eval().equals(b.eval());
    }
}