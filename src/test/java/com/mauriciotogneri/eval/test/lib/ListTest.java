package com.mauriciotogneri.eval.test.lib;

import com.mauriciotogneri.eval.lib.list.Append;
import com.mauriciotogneri.eval.lib.list.Head;
import com.mauriciotogneri.eval.lib.list.Length;
import com.mauriciotogneri.eval.lib.list.Tail;
import com.mauriciotogneri.eval.types.Num;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class ListTest
{
    @Test
    public void head()
    {
        Head head = new Head<>(new Num[] {new Num(1), new Num(2), new Num(3)});

        assertEquals(1d, head.eval());
    }

    @Test
    public void tail()
    {
        Tail tail = new Tail<>(new Num[] {new Num(1), new Num(2), new Num(3)});

        assertArrayEquals(new Number[] {2d, 3d}, tail.eval());
    }

    @Test
    public void length()
    {
        Length length = new Length<>(new Num[] {new Num(1), new Num(2), new Num(3)});

        assertEquals(3, length.eval());
    }

    @Test
    public void append()
    {
        Append append = new Append<>(new Num(1), new Num[] {new Num(2), new Num(3)});

        assertArrayEquals(new Number[] {1d, 2d, 3d}, append.eval());
    }
}