def phoneNumberCombination(c, s):
    num = {
        2: "abc",
        3: "def",
        4: "ghi",
        5: "jkl",
        6: "mno",
        7: "pqrs",
        8: "tuv",
        9: "wxyz"
    }
    
    if s == "":
        return c
    
    for x in s:
        for y in num.get(x):
            phoneNumberCombination(y, s)
    
phoneNumberCombination("", "23")