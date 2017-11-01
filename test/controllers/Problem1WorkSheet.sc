val list10 = List.range(1,11)
val threes = list10.filter(_ % 3 == 0)
val fives = list10.filter(_ % 5 == 0)
val threesNfives = List(threes, fives)
val t = threesNfives.flatten.sorted

def multiplesOf3n5(topRange : Int): Unit = {
  val list = List.range(1,topRange).filter(x => (x % 3 == 0)||(x % 5 == 0)).sum
  println(list)
}

val y = multiplesOf3n5(1000)
