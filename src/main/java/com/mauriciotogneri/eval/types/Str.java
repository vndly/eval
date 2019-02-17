package com.mauriciotogneri.eval.types;

import com.mauriciotogneri.eval.lib.Expression;

public class Str implements Expression<String>
{
    private final String s;

    public Str(String s)
    {
        this.s = s;
    }

    @Override
    public String eval()
    {
        return s;
    }
}