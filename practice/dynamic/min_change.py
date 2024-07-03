#without memo
def min_change(amount, coins):
    if amount == 0:
        return 0

    if amount < 0:
        return -1

    min = -1
    for coin in coins:
        subAmount = amount - coin
        subCoins = min_change(subAmount, coins)
        if subCoins != -1:
            numCoins = subCoins + 1
            if numCoins < min or min == -1:
                min = numCoins
    return min

print(min_change(5, [1,2,3]))