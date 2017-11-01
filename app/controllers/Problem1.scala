package controllers

/*

Multiples of 3 and 5

If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.

*/

class Problem1 {

  def multiplesOf3n5(topRange : Int): Unit = { List.range(1,topRange).filter(x => (x % 3 == 0)||(x % 5 == 0)).sum }

  println(multiplesOf3n5(1000))

}
