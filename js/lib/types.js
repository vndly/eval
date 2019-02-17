if (!Number.prototype.eval)
{
	Number.prototype.eval = function()
	{
		return this.valueOf()
	}
}

if (!Boolean.prototype.eval)
{
	Boolean.prototype.eval = function()
	{
		return this.valueOf()
	}
}

if (!String.prototype.eval)
{
	String.prototype.eval = function()
	{
		return this.valueOf()
	}
}

if (!Array.prototype.eval)
{
	Array.prototype.eval = function()
	{
		return this.valueOf()
	}
}

if (!Array.prototype.equals)
{
    Array.prototype.equals = function(array)
    {
	    if (!array)
	    {
	        return false
	    }

	    if (this.length != array.length)
	    {
	        return false
	    }

	    for (var i = 0, l = this.length; i < l; i++)
	    {
	        if (this[i] instanceof Array && array[i] instanceof Array)
	        {
	            if (!this[i].equals(array[i]))
	            {
	                return false
	            }
	        }
	        else if (this[i] != array[i])
	        {
	            return false
	        }
	    }

	    return true
	}
}

Object.defineProperty(Array.prototype, 'equals', {enumerable: false})