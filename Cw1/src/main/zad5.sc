def palindrome[A](xs: List[A]): Boolean = xs == xs.reverse

palindrome(List(1, 2, 3, 2, 1))
palindrome(List(1, 3, 2, 1))