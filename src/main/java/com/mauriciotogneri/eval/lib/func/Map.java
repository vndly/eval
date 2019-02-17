package com.mauriciotogneri.eval.lib.func;

import com.mauriciotogneri.eval.lib.Expression;

import java.util.function.Function;

public class Map<A, B> implements Expression<B[]>
{
    private final Expression<A>[] a;
    private final Function<Expression<A>, Expression<B>> f;

    public Map(Expression<A>[] a, Function<Expression<A>, Expression<B>> f)
    {
        this.a = a;
        this.f = f;
    }

    @Override
    @SuppressWarnings("unchecked")
    public B[] eval()
    {
        Object[] result = new Object[a.length];

        for (int i = 0; i < a.length; i++)
        {
            result[i] = f.apply(a[i]).eval();
        }

        return (B[]) result;
    }
}