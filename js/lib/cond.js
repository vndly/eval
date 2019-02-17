function If(a, b, c)
{
	return {
		eval: function()
		{
			return a.eval() ? b.eval() : c.eval()
		}
	}
}