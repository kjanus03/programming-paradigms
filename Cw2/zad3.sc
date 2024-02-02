// funkcja
val double = (x:Int) => x * 2
// metoda
def twice(x:Int): Int = x * 2

def power(a: Double, n:Int): Double =
  if (n == 0) 1
  else if (n%2==1) then a * power(a, n-1)
  else power(a, n/2) * power(a, n/2)

def abs(x: Double): Double =
  if (x < 0) -x
  else x


def root3(a:Double, epsilon:Double): Double =
  def raphsonNewton(x:Double): Double =
    if (abs(a - x * x * x) < epsilon * abs(a)) then x
    else raphsonNewton(x + (a / (x * x) - x) / 3)
  if (a>1.0) then raphsonNewton(a/3)
  else raphsonNewton(a*3)

root3(5, 0.01)


val root3_ = (a:Double, epsilon:Double) => {
  def raphsonNewton(x:Double): Double =
    if (abs(a - x * x * x) < epsilon * abs(a)) then x
    else raphsonNewton(x + (a / (x * x) - x) / 3)
  if (a>1.0) then raphsonNewton(a/3)
  else raphsonNewton(a*3)
}

root3_(5, 0.01)