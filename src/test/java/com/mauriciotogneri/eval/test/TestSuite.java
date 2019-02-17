package com.mauriciotogneri.eval.test;

import com.mauriciotogneri.eval.test.custom.FactorialTest;
import com.mauriciotogneri.eval.test.lib.BoolTest;
import com.mauriciotogneri.eval.test.lib.CompTest;
import com.mauriciotogneri.eval.test.lib.CondTest;
import com.mauriciotogneri.eval.test.lib.ListTest;
import com.mauriciotogneri.eval.test.lib.MathTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        BoolTest.class,
        CompTest.class,
        CondTest.class,
        ListTest.class,
        MathTest.class,

        FactorialTest.class,
})
public class TestSuite
{
}