function Add(a, b)
{
	return function()
    {
        return $(a) + $(b)
    }
}

function Sub(a, b)
{
	return function()
    {
        return $(a) - $(b)
    }
}

function Mul(a, b)
{
	return function()
    {
        return $(a) * $(b)
    }
}

function Div(a, b)
{
	return function()
    {
        return $(a) / $(b)
    }
}

function Inc(a)
{
	return function()
    {
        return $(a) + 1
    }
}

function Dec(a)
{
	return function()
    {
        return $(a) - 1
    }
}

function Pow(a, b)
{
	return function()
    {
        return Math.pow($(a), $(b))
    }
}

function Mod(a, b)
{
	return function()
    {
        return $(a) % $(b)
    }
}