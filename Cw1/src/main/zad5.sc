def reverse[A](xs: List[A]): List[A] = {
  if xs == Nil then Nil
  else reverse(xs.tail) ::: List(xs.head)
}

def palindrome[A](xs: List[A]): Boolean ={
  return xs == reverse(xs)

}

palindrome(List(1, 2, 3, 2, 1))
palindrome(List(1, 3, 2, 1))