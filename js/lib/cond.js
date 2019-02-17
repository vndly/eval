function If(a, b, c)
{
	return function()
	{
		return $(a) ? $(b) : $(c)
	}
}