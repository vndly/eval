function Map(l, f)
{
	return function()
    {
        var result = []

        for (var i = 0; i < l.length; i++)
        {
            result.push($(f(l[i])))
        }

        return result
    }
}