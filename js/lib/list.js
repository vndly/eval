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
		return l.eval()[0].eval()
	}
}

function Tail(l)
{
	this.eval = function()
	{
		return l.eval().slice(1).eval()
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