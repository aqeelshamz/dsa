#Input: l1 = [2,4,3], l2 = [5,6,4]
# Output: [7,0,8]
# Explanation: 342 + 465 = 807.

# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
        
class Solution:
    def addTwoNumbers(self, l1, l2):
        num1 = l1.val
        num2 = l2.val
        while l1.next != None and l2.next != None:
            l1 = l1.next
            l2 = l2.next
            num1 = num1 * 10
            num1 = num1 + l1.val
            num2 = num2 * 10
            num2 = num2 + l2.val
        num1 = int(str(num1)[::-1])
        num2 = int(str(num2)[::-1])
        
        sum = str(num1 + num2)
        res = [int(x) for x in ".".join(sum).split(".")]
        res.reverse()
        
        resList = []
        
        for n in res:
            resList.append(ListNode(val=n))
        
        for n in range(len(res)):
            resList[n].next = resList[:-(n+1)]
        
        return ListNode(val=resList[0].val, next=resList[0].next)       
        
n3 = ListNode(val=3, next=None)
n2 = ListNode(val=4, next=n3)
n1 = ListNode(val=2, next=n2)

n6 = ListNode(val=4, next=None)
n5 = ListNode(val=6, next=n6)
n4 = ListNode(val=5, next=n5)

print(Solution().addTwoNumbers(n1, n4))