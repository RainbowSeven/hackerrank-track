def format_nums(func):
    def wraps(nums):
        proper_nums = []
        for n in nums:
            if n.startswith('0'):
                proper_nums.append("+91 {} {}".format(n[1:6], n[6:]))
            elif len(n) is 12:
                proper_nums.append("+{} {} {}".format(n[0:2], n[2:7], n[7:]))
            elif n.startswith('+'):
                proper_nums.append("+{} {} {}".format(n[1:3], n[3:8], n[8:]))
            else:
                proper_nums.append("+91 {} {}".format(n[0:5], n[5:]))
        return func(proper_nums)
    return wraps

@format_nums
def sortnums(nums):
    return sorted(nums)

N = input()
nums = []

for i in range(N):
    nums.append(raw_input())

for num in sortnums(nums):
    print num
