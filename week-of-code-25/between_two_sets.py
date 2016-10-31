# !/bin/python

# n, m = raw_input().strip().split(' ')
# n, m = int(n), int(m)
a = [2, 4, ]  # map(int, raw_input().strip().split(' '))
b = [16, 32, 96, ]   # map(int, raw_input().strip().split(' '))

# elements in A are factors of x.
#  x is a factor of all elements in B.

btw = 0
for i in range(1, 101):
    if reduce(lambda x, y: x and not(i % y), a, True) and reduce(lambda x, y: x and not(y % i), b, True):
        btw += 1

print btw
