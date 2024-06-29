def longestCommonPrefix(strs):
        prefix = ""
        for x in range(len(strs[0])):
            for y in strs:
                if y[:x+1] != strs[0][:x+1]:
                    return prefix
            prefix = strs[0][:x+1]
                
        return prefix

print(longestCommonPrefix(strs=["flower", "flow", "flight"]))