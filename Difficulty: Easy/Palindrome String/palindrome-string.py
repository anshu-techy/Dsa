class Solution:
    def isPalindrome(self, S: str) -> int:
        start = 0
        end = len(S) - 1

        while start < end:
            if S[start] != S[end]:
                return 0   # Not a palindrome
            start += 1
            end -= 1

        return 1   # Palindrome
      
