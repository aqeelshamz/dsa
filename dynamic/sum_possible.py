def sum_possible(amount, nums, memo):
    if amount == 0:
        return True

    if amount < 0:
        return False

    if amount in list(memo.keys()):
        return memo.get(amount)

    for n in nums:
        if n > amount:
            continue
        ans = amount - n
        if sum_possible(ans, nums, memo):
            memo[amount] = True
            return True
        else:
            memo[amount] = False
            return False
        
    memo[amount] = False     
    return False
    
print(sum_possible(4, [1,21,3], {}))
