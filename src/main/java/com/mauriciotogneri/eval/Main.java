package com.mauriciotogneri.eval;

import com.mauriciotogneri.eval.expressions.lib.Factorial;
import com.mauriciotogneri.eval.expressions.types.Num;

public class Main
{
    public static void main(String[] args)
    {
        Factorial factorial = new Factorial(new Num(5));
        System.out.println(factorial.eval());
    }
}