package com.mauriciotogneri.eval.lib;

public interface Expression<T>
{
    T eval();

    /*
        Types:
            Boolean
            Number
            String
            []

        Todo:
            Generics	T Element([T] l Number i) = ...
            Tuples		Person: {Number Boolean}
            Functions	[B] Map([A] a <A B> f) = ...

        -------------------------------------

        Number Factorial(Number n) = If(Equal(n 0) 1 Mul(n Factorial(Subtract(n 1))))
    */
}