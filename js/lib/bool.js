function Not(b)
{
	return {
		eval: function()
        {
            return !b.eval()
        }
	}
}

function And(a, b)
{
	return {
		eval: function()
        {
            return a.eval() && b.eval()
        }
	}
}

function Or(a, b)
{
	return {
		eval: function()
        {
            return a.eval() || b.eval()
        }
	}
}