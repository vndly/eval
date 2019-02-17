function Length(l)
{
	this.eval = function()
	{
		return l.eval().length
	}
}

function Head(l)
{
	this.eval = function()
	{
		var list = l.eval()

        if (list.length == 0)
        {
            throw new Error('Cannot get head of empty list')
        }

		return list[0].eval()
	}
}

function Tail(l)
{
	this.eval = function()
	{
		var list = l.eval()

		if (list.length == 0)
		{
			throw new Error('Cannot get tail of empty list')
		}

		return list.slice(1).eval()
	}
}

function AppendFirst(e, l)
{
	this.eval = function()
	{
		var result = []
		result.push(e.eval())

		var list = l.eval()

		for (var i = 0; i < list.length; i++)
        {
            result.push(list[i].eval())
        }

		return result
	}
}

function AppendLast(e, l)
{
	this.eval = function()
	{
		var result = []
		var list = l.eval()

		for (var i = 0; i < list.length; i++)
        {
            result.push(list[i].eval())
        }

        result.push(e.eval())

		return result
	}
}

function ElementAt(e, l)
{
	this.eval = function()
	{
		return l.eval()[e.eval()].eval()
	}
}