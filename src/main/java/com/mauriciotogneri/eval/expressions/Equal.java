package com.mauriciotogneri.eval.expressions;

public class Equal implements Expression<Bool>
{
    private final Expression a;
    private final Expression b;

    public Equal(Expression a, Expression b)
    {
        this.a = a;
        this.b = b;
    }

    @Override
    public Bool eval()
    {
        return new Bool(a.eval().equals(b.eval()));
    }
}