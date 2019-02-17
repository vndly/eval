function Not(b)
{
	return function()
    {
        return !$(b)
    }
}

function And(a, b)
{
	return function()
    {
        return $(a) && $(b)
    }
}

function Or(a, b)
{
	return function()
    {
        return $(a) || $(b)
    }
}