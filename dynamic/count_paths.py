def count_paths(pos, row, cols, wall, target):
    min = 0
    if pos == target:
        return min
    
    newPos1 = [pos[0] + 1, pos[1]]
    newPos2 = [pos[0], pos[1] + 1]
    
    if newPos1 != wall and newPos1[0] < row and newPos1[1] < cols:
        print(newPos1)
        min = count_paths(newPos1, row, cols, wall, target) + 1
    elif newPos2 != wall and newPos2[0] < row and newPos2[1] < cols:
        print(newPos2)
        min = count_paths(newPos2, row, cols, wall, target) + 1
        
    return min

print(count_paths([0, 0], 3, 3, [2,0], [2, 2]))