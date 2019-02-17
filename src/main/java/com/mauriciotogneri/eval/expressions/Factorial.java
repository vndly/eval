package com.mauriciotogneri.eval.expressions;

public class Factorial implements Expression<Number>
{
    private final Expression<Number> n;

    public Factorial(Expression<Number> n)
    {
        this.n = n;
    }

    @Override
    public Number eval()
    {
        //FactorialExpression factorial = Factorial::new;

        return new If<>(new Equal(n,
                                  new Num(0)),
                        new Num(1),
                        new Mul(n,
                                new Factorial(new Sub(n,
                                                      new Num(1))
                                )
                        )
        ).eval();
    }

    public interface FactorialExpression
    {
        Factorial create(Expression<Number> n);
    }
}