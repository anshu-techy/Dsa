class Solution:
    def reverseWords(self, s):
        # code here
        return ".".join([x for x in s.split(".")[::-1] if len(x) > 0])
        