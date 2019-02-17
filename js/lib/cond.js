function If(a, b, c)
{
	this.eval = function()
	{
		return a.eval() ? b.eval() : c.eval()
	}
}