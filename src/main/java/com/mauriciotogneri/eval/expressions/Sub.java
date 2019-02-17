package com.mauriciotogneri.eval.expressions;

public class Sub implements Expression<Number>
{
    private final Expression<Number> a;
    private final Expression<Number> b;

    public Sub(Expression<Number> a, Expression<Number> b)
    {
        this.a = a;
        this.b = b;
    }

    @Override
    public Number eval()
    {
        return a.eval().doubleValue() - b.eval().doubleValue();
    }
}