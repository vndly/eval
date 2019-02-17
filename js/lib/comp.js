function Equal(a, b)
{
	return function()
    {
        return $(a) === $(b)
    }
}

function NotEqual(a, b)
{
	return function()
	{
		return $(a) !== $(b)
	}
}

function LessThan(a, b)
{
	return function()
    {
        return $(a) < $(b)
    }
}

function LessEqual(a, b)
{
	return function()
    {
        return $(a) <= $(b)
	}
}

function GreaterThan(a, b)
{
	return function()
    {
        return $(a) > $(b)
	}
}

function GreaterEqual(a, b)
{
	return function()
    {
        return $(a) >= $(b)
    }
}