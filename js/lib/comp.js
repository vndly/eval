function Equal(a, b)
{
	this.value = function()
	{
		return a.value() === b.value()
	}
}