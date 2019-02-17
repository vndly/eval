function Not(b)
{
	this.eval = function()
	{
		return !b.eval()
	}
}

function And(a, b)
{
	this.eval = function()
	{
		return a.eval() && b.eval()
	}
}

function Or(a, b)
{
	this.eval = function()
	{
		return a.eval() || b.eval()
	}
}