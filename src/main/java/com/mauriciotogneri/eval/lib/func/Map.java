package com.mauriciotogneri.eval.lib.func;

import com.mauriciotogneri.eval.lib.Expression;

import java.util.List;
import java.util.function.Function;

public class Map<A, B> implements Expression<B[]>
{
    private final List<Expression<A>> a;
    private final Function<Expression<A>, Expression<B>> f;

    public Map(List<Expression<A>> a, Function<Expression<A>, Expression<B>> f)
    {
        this.a = a;
        this.f = f;
    }

    @Override
    @SuppressWarnings("unchecked")
    public B[] eval()
    {
        Object[] result = new Object[a.size()];

        for (int i = 0; i < a.size(); i++)
        {
            result[i] = f.apply(a.get(i)).eval();
        }

        return (B[]) result;
    }
}