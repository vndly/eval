function Add(a, b)
{
	return {
		eval: function()
        {
            return a.eval() + b.eval()
        }
	}
}

function Sub(a, b)
{
	return {
        eval: function()
        {
            return a.eval() - b.eval()
        }
    }
}

function Mul(a, b)
{
	return {
		eval: function()
        {
            return a.eval() * b.eval()
        }
	}
}

function Div(a, b)
{
	return {
        eval: function()
        {
            return a.eval() / b.eval()
        }
    }
}

function Inc(a)
{
	return {
		eval: function()
        {
            return a.eval() + 1
        }
	}
}

function Dec(a)
{
	return {
		eval: function()
        {
            return a.eval() - 1
        }
	}
}

function Pow(a, b)
{
	return {
		eval: function()
        {
            return Math.pow(a.eval(), b.eval())
        }
	}
}

function Mod(a, b)
{
	return {
		eval: function()
        {
            return a.eval() % b.eval()
        }
	}
}