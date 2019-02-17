function Equal(a, b)
{
	this.eval = function()
	{
		return a.eval() === b.eval()
	}
}

function NotEqual(a, b)
{
	this.eval = function()
	{
		return a.eval() !== b.eval()
	}
}

function LessThan(a, b)
{
	this.eval = function()
	{
		return a.eval() < b.eval()
	}
}

function LessEqual(a, b)
{
	this.eval = function()
	{
		return a.eval() <= b.eval()
	}
}

function GreaterThan(a, b)
{
	this.eval = function()
	{
		return a.eval() > b.eval()
	}
}

function GreaterEqual(a, b)
{
	this.eval = function()
	{
		return a.eval() >= b.eval()
	}
}