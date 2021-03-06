function run()
{
    bool()
	comp()
	cond()
	func()
	list()
	math()
	custom()
}

function bool()
{
    console.log('Bool')

    var not = Not(true)
	check(not, false)

	var and = And(true, false)
	check(and, false)

	var or = Or(true, false)
	check(or, true)

	console.log('')
}

function comp()
{
    console.log('Comp')

    var equal = Equal(3, 4)
	check(equal, false)

	var notEqual = NotEqual(3, 4)
	check(notEqual, true)

	var lessThan = LessThan(3, 4)
	check(lessThan, true)

	var lessEqual = LessEqual(3, 4)
	check(lessEqual, true)

	var greaterThan = GreaterThan(3, 4)
	check(greaterThan, false)

	var greaterEqual = GreaterEqual(3, 4)
	check(greaterEqual, false)

	console.log('')
}

function cond()
{
    console.log('Cond')

    var ifThenElse = If(false, 3, 4)
	check(ifThenElse, 4)

	console.log('')
}

function func()
{
    console.log('Func')

    var map = Map([1, 2, 3], Inc)
	check(map, [2, 3, 4])

	console.log('')
}

function list()
{
    console.log('List')

    var length = Length([1, 2, 3])
	check(length, 3)

    var head = Head([1, 2, 3])
	check(head, 1)

	try
	{
		var headError = Head([])
		check(headError, null)
	}
	catch (e)
	{
		check(true, true)
	}

	var tail = Tail([1, 2, 3])
	check(tail, [2, 3])

	try
	{
		var tailError = Tail([])
		check(tailError, null)
	}
	catch (e)
	{
		check(true, true)
	}

	var appendFirst = AppendFirst(1, [2, 3])
	check(appendFirst, [1, 2, 3])

	var appendLast = AppendLast(3, [1, 2])
	check(appendLast, [1, 2, 3])

    console.log('')
}

function math()
{
    console.log('Math')

    var add = Add(4, 8)
	check(add, 12)

	var sub = Sub(4, 8)
	check(sub, -4)

    var mul = Mul(4, 8)
	check(mul, 32)

    var div = Div(4, 8)
	check(div, 0.5)

	var inc = Inc(4)
	check(inc, 5)

	var dec = Dec(4)
	check(dec, 3)

    var pow = Pow(4, 8)
	check(pow, 65536)

    var mod = Mod(4, 8)
	check(mod, 4)

	console.log('')
}

// ================================================================================== \\

function custom()
{
    console.log('Custom')

    var factorial = Factorial(5)
	check(factorial, 120)

	var fibonacci = Fibonacci(10)
	check(fibonacci, [1, 1, 2, 3, 5, 8, 13, 21, 34, 55])

	console.log('')
}

// Number Factorial(Number n) = If(Equal(n 0) 1 Mul(n Factorial(Sub(n 1))))

function Factorial(n)
{
	return function()
	{
		return $(If(Equal(n, 0),
				    1,
                    Mul(n,
					    Factorial(Sub(n, 1))
				    )))
	}
}

function Fibonacci(limit)
{
	return function()
	{
		return $(Fibo(0, limit, []))
	}
}

function Fibo(index, limit, list)
{
	return function()
	{
		return $(If(GreaterEqual(index, limit),
	                list,
	                FiboCase0(index, limit, list)))
	}
}

function FiboCase0(index, limit, list)
{
	return function()
	{
		return $(If(Equal(index, 0),
                    Fibo(1, limit, [1]),
                    FiboCase1(index, limit, list)))
	}
}

function FiboCase1(index, limit, list)
{
	return function()
	{
		return $(If(Equal(index, 1),
                    Fibo(2, limit, [1, 1]),
                    FiboCaseRest(index, limit, list)))
	}
}

function FiboCaseRest(index, limit, list)
{
	return function()
	{
		return $(Fibo(Inc(index),
                      limit,
                      AppendLast(Add(FiboLast1(index, list),
                                     FiboLast2(index, list)),
                                 list)))
	}
}

function FiboLast1(index, list)
{
	return function()
	{
		return $(ElementAt(Sub(index, 1), list))
	}
}

function FiboLast2(index, list)
{
	return function()
	{
		return $(ElementAt(Sub(index, 2), list))
	}
}

// ================================================================================== \\

function check(expression, expected)
{
    var actual = $(expression)

    if (equal(actual, expected))
    {
        console.log(true)
    }
    else
    {
        console.error(actual, expected)
    }
}

function equal(actual, expected)
{
    if (Array.isArray(actual))
    {
        return actual.equals(expected)
    }
    else
    {
        return actual === expected
    }
}