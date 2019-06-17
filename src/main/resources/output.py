def bar():
	return 3

def foo(a,b):
	x = a + b
	x = x * 2
	if x == 1:
		z = 1
		c = 3 * 12.5
	elif x >= 2:
		z = bar()
	else:
		z = 3
		f = 5
		while f > 1:
			f = f - 1
			break
		i = 0
		while i < 3:
			z = z + 3
			i = i + 1
		while true:
			if z == 1:
				a = 1
			if z == 2:
				a = 2
				break
			if true:
				a = 7
			break
	return z

x = 12
z = foo(x, 12)
