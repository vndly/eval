if (!Number.prototype.value)
{
	Number.prototype.value = function()
	{
		return this.valueOf()
	}
}

if (!Boolean.prototype.value)
{
	Boolean.prototype.value = function()
	{
		return this.valueOf()
	}
}