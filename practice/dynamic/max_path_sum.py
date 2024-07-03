def max_path_sums(pos, grid, memo):
    rows = len(grid)
    cols = len(grid[0])
    
    if pos == [rows - 1, cols - 1]:
        return grid[pos[0]][pos[1]]
    
    if memo.get(str(pos)):
        return memo.get(str(pos))

    newPos1 = [pos[0] + 1, pos[1]]
    newPos2 = [pos[0], pos[1] + 1]
    
    max1 = 0
    max2 = 0
    if newPos1[0] < rows and newPos1[1] < cols:
        max1 = grid[pos[0]][pos[1]] + max_path_sums(newPos1, grid, memo)
    if newPos2[0] < rows and newPos2[1] < cols:
        max2 = grid[pos[0]][pos[1]] + max_path_sums(newPos2, grid, memo)
    
    max = max1 if max1 > max2 else max2
    memo[str(pos)] = max
    
    return max

print(max_path_sums([0,0], [
  [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
  [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
  [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
  [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
  [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
  [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
  [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
  [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
  [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
  [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
  [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
  [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
  [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
  [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
  [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
], {}))