def insert[A](a: A, pos: Int,xs: List[A]): List[A] = {
  if pos < 0 then throw new Exception("pozycja mniejsza od 0")
  if xs == Nil then List(a)
  else if pos <= 0 then List(a) ::: xs
  else List(xs.head) ::: insert(a, pos - 1, xs.tail)
}

var lista = List("bardzo", "lubie", "pic", "herbate")
var nowa_lista = insert("piwo", 3, lista)
nowa_lista

insert("i", 4, nowa_lista)

insert(6, 3, List(1, 2, 3, 4, 5))
insert(6, 10, List(1, 2, 3, 4, 5))
