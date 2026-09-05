class Solution(object):
    def isPalindrome(self, s):

        s = s.lower()

        clean = ""

        for char in s:
            if char.isalnum():
                clean = clean + char

        if clean == clean[::-1]:
            return True
        else:
            return False