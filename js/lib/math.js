function Add(a, b)
{
	this.eval = function()
	{
		return a.eval() + b.eval()
	}
}

function Sub(a, b)
{
	this.eval = function()
	{
		return a.eval() - b.eval()
	}
}

function Mul(a, b)
{
	this.eval = function()
	{
		return a.eval() * b.eval()
	}
}

function Div(a, b)
{
	this.eval = function()
	{
		return a.eval() / b.eval()
	}
}

function Inc(a)
{
	this.eval = function()
	{
		return a.eval() + 1
	}
}

function Dec(a)
{
	this.eval = function()
	{
		return a.eval() - 1
	}
}

function Pow(a, b)
{
	this.eval = function()
	{
		return Math.pow(a.eval(), b.eval())
	}
}

function Mod(a, b)
{
	this.eval = function()
	{
		return a.eval() % b.eval()
	}
}