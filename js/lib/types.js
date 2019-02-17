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

if (!String.prototype.value)
{
	String.prototype.value = function()
	{
		return this.valueOf()
	}
}

if (!Array.prototype.value)
{
	Array.prototype.value = function()
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

	    for (var i = 0, l=this.length; i < l; i++)
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
// Hide method from for-in loops
Object.defineProperty(Array.prototype, "equals", {enumerable: false});