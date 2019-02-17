package com.mauriciotogneri.eval.test.expressions;

import com.mauriciotogneri.eval.lib.Equal;
import com.mauriciotogneri.eval.lib.Expression;
import com.mauriciotogneri.eval.lib.If;
import com.mauriciotogneri.eval.lib.math.Mul;
import com.mauriciotogneri.eval.lib.math.Sub;
import com.mauriciotogneri.eval.types.Num;

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