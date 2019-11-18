// This program simply checks whether the string passed in is a Palindrom regardless of its case
// so if we pass in "Aba" this function would return true.

boolean isCaseInsensitivePalindrome(String inputString) {
		return new StringBuilder(inputString).reverse().toString().toLowerCase().equals(inputString.toLowerCase());
}

// The process of the program
- Create a string builder object which has the inputString
- reverse that string
- stringify that string
- make all characters lower case in that string
- check if it equals the lowercase version of the original string
