package com.mauriciotogneri.eval.test.custom;

import com.mauriciotogneri.eval.lib.Expression;
import com.mauriciotogneri.eval.lib.comp.Equal;
import com.mauriciotogneri.eval.lib.cond.If;
import com.mauriciotogneri.eval.lib.math.Mul;
import com.mauriciotogneri.eval.lib.math.Sub;
import com.mauriciotogneri.eval.types.Num;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FactorialTest
{
    @Test
    public void factorial()
    {
        Factorial factorial = new Factorial(new Num(5));

        assertEquals(120d, factorial.eval());
    }

    public static class Factorial implements Expression<Number>
    {
        private final Expression<Number> n;

        public Factorial(Expression<Number> n)
        {
            this.n = n;
        }

        @Override
        public Number eval()
        {
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
    }
}