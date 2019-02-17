function Mul(a, b)
{
	this.value = function()
	{
		return a.value() * b.value()
	}
}

function Sub(a, b)
{
	this.value = function()
	{
		return a.value() - b.value()
	}
}