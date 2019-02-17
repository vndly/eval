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