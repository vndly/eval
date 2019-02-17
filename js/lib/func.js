function Map(l, f)
{
	this.eval = function()
    {
        var result = []

        for (var i = 0; i < l.length; i++)
        {
            result.push(new f(l[i]).eval())
        }

        return result
    }
}