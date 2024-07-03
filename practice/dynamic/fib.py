def fib(n, memo):
    if n == 0 or n == 1:
        return n

    if memo.get(n):
        return memo.get(n)

    ans = fib(n - 1, memo) + fib(n - 2, memo)
    memo[n] = ans
    return ans

n = int(input("Enter a number: "))
print(fib(n, {}))