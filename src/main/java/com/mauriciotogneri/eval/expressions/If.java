package com.mauriciotogneri.eval.expressions;

public class If implements Expression
{
    private final Bool a;
    private final Expression b;
    private final Expression c;

    public If(Bool a, Expression b, Expression c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public Object eval()
    {
        return a.eval() ? b.eval() : c.eval();
    }
}