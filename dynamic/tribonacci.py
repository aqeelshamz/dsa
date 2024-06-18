def tribonacci(n, memo):
    if n == 0 or n == 1:
        return 0

    if n == 2:
        return 1
    
    if memo.get(n):
        return memo.get(n)
    
    ans = tribonacci(n - 1, memo) + tribonacci(n - 2) + tribonacci(n - 3)
    memo[n] = ans
    return ans
    
for i in range(1, 30):
    print(f"{i}: {tribonacci(i, {})}")