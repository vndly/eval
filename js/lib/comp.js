function Equal(a, b)
{
	return {
		eval: function()
        {
            return a.eval() === b.eval()
        }
	}
}

function NotEqual(a, b)
{
	return {
		eval: function()
		{
			return a.eval() !== b.eval()
		}
	}
}

function LessThan(a, b)
{
	return {
		eval: function()
        {
            return a.eval() < b.eval()
        }
	}
}

function LessEqual(a, b)
{
	return {
		eval: function()
        {
            return a.eval() <= b.eval()
        }
	}
}

function GreaterThan(a, b)
{
	return {
		eval: function()
    	{
    		return a.eval() > b.eval()
    	}
	}
}

function GreaterEqual(a, b)
{
	return {
		eval: function()
        {
            return a.eval() >= b.eval()
        }
	}
}