package com.mauriciotogneri.eval.test;

import com.mauriciotogneri.eval.test.custom.FactorialTest;
import com.mauriciotogneri.eval.test.lib.ListTest;
import com.mauriciotogneri.eval.test.lib.MathTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        MathTest.class,
        ListTest.class,

        FactorialTest.class,
})
public class TestSuite
{
}