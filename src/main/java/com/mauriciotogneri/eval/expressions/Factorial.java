package com.mauriciotogneri.eval.expressions;

public class Factorial implements Expression<Num>
{
    private final Expression<Num> n;

    public Factorial(Expression<Num> n)
    {
        this.n = n;
    }

    @Override
    public Num eval()
    {
        return new If<>(
                new Equal(n, new Num(0)),
                new Num(1),
                new Mul(
                        n,
                        new Factorial(
                                new Sub(n, new Num(1))
                        )
                )
        ).eval();
    }
}