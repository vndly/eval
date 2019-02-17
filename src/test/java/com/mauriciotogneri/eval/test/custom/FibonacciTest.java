package com.mauriciotogneri.eval.test.custom;

import com.mauriciotogneri.eval.lib.Expression;
import com.mauriciotogneri.eval.types.Num;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class FibonacciTest
{
    @Test
    public void factorial()
    {
        Fibonacci fibonacci = new Fibonacci(new Num(5));

        assertArrayEquals(new Number[] {1d, 1d, 2d, 3d, 5d}, fibonacci.eval());
    }

    public static class Fibonacci implements Expression<Number[]>
    {
        private final Expression<Number> n;

        public Fibonacci(Expression<Number> n)
        {
            this.n = n;
        }

        @Override
        public Number[] eval()
        {
            return new Fibo(new Num(0),
                            n,
                            null // []
            ).eval();
        }
    }

    public static class Fibo implements Expression<Number[]>
    {
        private final Expression<Number> index;
        private final Expression<Number> limit;
        private final Expression<Number>[] list;

        public Fibo(Expression<Number> index,
                    Expression<Number> limit,
                    Expression<Number>[] list)
        {
            this.index = index;
            this.limit = limit;
            this.list = list;
        }

        @Override
        public Number[] eval()
        {
            /*return new If<>(new GreaterEqual(index,
                                             limit),
                            list,
                            new If<>(new Equal(index,
                                               new Num(0)),
                                     new Fibo(new Num(1),
                                              limit,
                                              null), // [1]
                                     new If<>(new Equal(index,
                                                        new Num(1)),
                                              new Fibo(new Num(2),
                                                       limit,
                                                       null), // [1, 1]
                                              new Fibo(new Inc(index),
                                                       limit,
                                                       null)
                                     )
                            )
            ).eval();*/
            return null;
        }
    }
}