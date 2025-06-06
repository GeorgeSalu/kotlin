package br.com.secao5

/*
Given a string, return true if the string is a palindrome or false if it is not. Palindromes are strings that form the
same word if it is reversed. Include spaces and punctuation in determining if the string is a palindrome.

Examples
palindrome("civic") // true
palindrome("abcdefg") // false
*/

fun isPalindrome(str: String) : Boolean {
    return  str == str.reversed()
}