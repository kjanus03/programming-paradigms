def reverse4[A](x: (A, A, A, A)): (A, A, A, A) = (x._4, x._3, x._2, x._1)

reverse4((1, 2, 3, 4))
reverse4((1, 3.5, 'a', "Hi!"))
