function If(a, b, c)
{
	this.value = function()
	{
		return a.value() ? b.value() : c.value()
	}
}