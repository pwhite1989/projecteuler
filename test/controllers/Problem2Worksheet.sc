import scala.collection.mutable.ListBuffer

def fiboList (a : Int, b : Int) = {

  var x = a
  var y = b
  var z = a + b
  val list = ListBuffer[Int]()

  while (y <= 4000000) {

    z = x + y
    list += x
    x = y
    y = z
  }

  list.toList.filter(i => i % 2 == 0).sum

}

fiboList(1, 2)




