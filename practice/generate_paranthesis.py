def generateParanthesisX(n, list):
    if n == 0:
        return
    print(list[-n:], end="")
    n = n - 1
    for x in list:
        generateParanthesisX(n, list)
    
def generateParenthesis(n):
    list = ["(" if i < (n*2) // 2 else ")" for i in range(n*2)]
    # print(list)
    generateParanthesisX(n, list)    

generateParenthesis(3)        
