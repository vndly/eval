package com.mauriciotogneri.eval.test;

import com.mauriciotogneri.eval.lib.list.Tail;
import com.mauriciotogneri.eval.types.Num;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TailTest
{
    @Test
    public void tail()
    {
        Tail tail = new Tail<>(new Num[] {new Num(1), new Num(2), new Num(3)});

        assertArrayEquals(new Number[] {2d, 3d}, tail.eval());
    }
}