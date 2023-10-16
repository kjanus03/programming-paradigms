def listLength[A](xs: List[A]): Int = {
  if xs == Nil then 0
  else 1 + listLength(xs.tail)
}

def insert[A](a: A, pos: Int,xs: List[A]): List[A] = {
  if pos <= 0 then List(a) ::: xs
  else if pos >= listLength(xs) then xs ::: List(a)
  else List(xs.head) ::: insert(a, pos - 1, xs.tail)
}

var lista = List("bardzo", "lubie", "pic", "herbate")
var nowa_lista = insert("piwo", 3, lista)
nowa_lista

insert("i", 4, nowa_lista)
