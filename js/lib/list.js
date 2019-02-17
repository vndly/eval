function Length(l)
{
	return function()
    {
        return $(l).length
    }
}

function Head(l)
{
	return function()
    {
        var list = $(l)

        if (list.length == 0)
        {
            throw new Error('Cannot get head of empty list')
        }

        return list[0]
    }
}

function Tail(l)
{
	return function()
    {
        var list = $(l)

        if (list.length == 0)
        {
            throw new Error('Cannot get tail of empty list')
        }

        return list.slice(1)
    }
}

function AppendFirst(e, l)
{
	return function()
    {
        var result = []
        result.push($(e))

        var list = $(l)

        for (var i = 0; i < list.length; i++)
        {
            result.push(list[i])
        }

        return result
    }
}

function AppendLast(e, l)
{
	return function()
    {
        var result = []
        var list = $(l)

        for (var i = 0; i < list.length; i++)
        {
            result.push(list[i])
        }

        result.push($(e))

        return result
    }
}

function ElementAt(e, l)
{
	return function()
    {
        return $(l)[$(e)]
    }
}