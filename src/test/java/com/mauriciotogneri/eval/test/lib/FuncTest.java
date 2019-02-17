package com.mauriciotogneri.eval.test.lib;

import com.mauriciotogneri.eval.lib.func.Map;
import com.mauriciotogneri.eval.lib.math.Inc;
import com.mauriciotogneri.eval.types.Num;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class FuncTest
{
    @Test
    public void map()
    {
        Map map = new Map<>(Arrays.asList(new Num(1), new Num(2), new Num(3)), Inc::new);

        assertArrayEquals(new Number[] {2d, 3d, 4d}, map.eval());
    }
}