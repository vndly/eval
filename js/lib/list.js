function Length(l)
{
	this.eval = function()
	{
		return l.length
	}
}

function Head(l)
{
	this.eval = function()
	{
		return l[0].eval()
	}
}

function Tail(l)
{
	this.eval = function()
	{
		return l.slice(1).eval()
	}
}

function Append(e, l)
{
	this.eval = function()
	{
		var result = []
		result.push(e.eval())

		for (var i = 0; i < l.length; i++)
        {
            result.push(l[i].eval())
        }

		return result
	}
}