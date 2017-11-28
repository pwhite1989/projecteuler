package controllers

  class Primes {

    val primes = BigInt(2) #:: Stream.iterate(BigInt(3))(_ + 2).filter(_.isProbablePrime(10))


    def primeFactorOf(i: BigInt): Option[BigInt] = {
      val j: BigInt = i.sqrt
      primes.takeWhile(_ <= j).filter(i % _ == 0).lastOption
    }

    implicit class BigIntSqrt(n: BigInt) {

      def sqrt: BigInt = {
      println("----------------___" + n)
        assert(n > -1)

        if (n < 2) {
          n
        } else {
          val smallCandidate = (n >> 2).sqrt << 1
          val largeCandidate = smallCandidate + 1
          if ((largeCandidate ^ 2) > n) {
            smallCandidate
          } else {
            largeCandidate
          }
        }
      }


    }


    primeFactorOf(BigInt("13195"))

  }
/*import scala.annotation.tailrec

/*

The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?

 */

class Problem3 {

  def listPrimes(p: Int): Int = {
    val x = Stream.from(3).filter(isPrime3).takeWhile(_ <= scala.math.sqrt(p))
    x.filter(p % _ == 0).toList.last
  }

  def isPrime3(n: Int): Boolean = {
    if (n == 2 || n == 3) {
      true
    } else if (n < 2 || n % 2 == 0) {
      false
    } else {
      isPrime3Rec(n, 3)
    }
  }

  @tailrec
  final def isPrime3Rec(n:Int, i: Int): Boolean = {
    (n % i != 0) && ((i * i > n) || isPrime3Rec(n, i + 2))
  }



  listPrimes(13195)
}*/

//implicit class BigStream[A](stream: Stream[A]) {
//
//  @tailrec
//  private def lift(s: Stream[A], i: BigInt): Option[A] = {
//
//    assert(i > -1)
//
//    if (i == 0) {
//      s.headOption
//    } else {
//      lift(s.tail, i - 1)
//    }
//  }
//
//  def foo(i: BigInt): Option[A] =
//    lift(stream, i)
//}
