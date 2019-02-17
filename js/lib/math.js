function Mul(a, b)
{
	this.eval = function()
	{
		return a.eval() * b.eval()
	}
}

function Sub(a, b)
{
	this.eval = function()
	{
		return a.eval() - b.eval()
	}
}