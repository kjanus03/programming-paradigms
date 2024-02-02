// let uncurry f(x, y, z) = f x y z;;
def uncurry3[A, B, C, D](f: (x:A) => (y:B) => (z:C) => (q:D)): (x:A, y:B, z:C) => (q:D) =
  (x:A, y:B, z:C) => f(x)(y)(z)


def pithagoras3(x: Int)(y: Int)(z: Int): Int =
  x * x + y * y + z * z

uncurry3(pithagoras3)(1, 2, 3)

def curry3[A, B, C, D](f: (x:A, y:B, z:C) => D): A => B => C => D =
  (a: A) => (b: B) => (c: C) => f(a, b, c)