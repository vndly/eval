function Length(l)
{
	this.value = function()
	{
		return l.length
	}
}

function Head(l)
{
	this.value = function()
	{
		return l[0].value()
	}
}

function Tail(l)
{
	this.value = function()
	{
		return l.slice(1).value()
	}
}

function Append(e, l)
{
	this.value = function()
	{
		var result = []
		result.push(e.value())

		for (var i = 0; i < l.length; i++)
        {
            result.push(l[i].value())
        }

		return result
	}
}