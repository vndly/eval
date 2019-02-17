package com.mauriciotogneri.eval.test.custom;

import com.mauriciotogneri.eval.lib.Expression;
import com.mauriciotogneri.eval.types.Num;

import org.junit.Test;

import java.util.List;

public class FibonacciTest
{
    @Test
    public void factorial()
    {
        Fibonacci fibonacci = new Fibonacci(new Num(5));

        //assertArrayEquals(new Number[] {1d, 1d, 2d, 3d, 5d}, fibonacci.eval());
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
            /*return new Fibo(new Num(0),
                            n,
                            Arrays.asList()
            ).eval();*/
            return null;
        }
    }

    public static class Fibo implements Expression<List<Number>>
    {
        private final Expression<Number> index;
        private final Expression<Number> limit;
        private final Expression<List<Number>> list;

        public Fibo(Expression<Number> index,
                    Expression<Number> limit,
                    Expression<List<Number>> list)
        {
            this.index = index;
            this.limit = limit;
            this.list = list;
        }

        @Override
        public List<Number> eval()
        {
            /*return new If<>(new GreaterEqual(index,
                                             limit),
                            list,
                            list
                            new If<>(new Equal(index,
                                               new Num(0)),
                                     new Fibo(new Num(1),
                                              limit,
                                              Arrays.asList(new Num(1))),
                                     new If<>(new Equal(index,
                                                        new Num(1)),
                                              new Fibo(new Num(2),
                                                       limit,
                                                       Arrays.asList(new Num(1), new Num(1))),
                                              new Fibo(new Inc(index),
                                                       limit,
                                                       Arrays.asList())
                                     )
                            )
            ).eval();*/
            return null;
        }
    }
}