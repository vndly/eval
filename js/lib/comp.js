function Equal(a, b)
{
	this.eval = function()
	{
		return a.eval() === b.eval()
	}
}