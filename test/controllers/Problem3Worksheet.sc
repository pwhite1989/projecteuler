

val primes = BigInt(2) #:: Stream.iterate(BigInt(3))(_ + 2).filter(_.isProbablePrime(10))


def primeFactorOf(i: BigInt): Option[BigInt] = {
  val j: BigInt = i.sqrt
  primes.takeWhile(_ <= j).filter(i % _ == 0).lastOption
}

implicit class BigIntSqrt (n: BigInt) {


 def sqrt: BigInt = {

    assert(n > -1)
    if (n < 2) {
      n
    } else {
      val smallCandidate = (n >> 2).sqrt << 1
      val largeCandidate = smallCandidate + 1
      if (largeCandidate.pow(2) > n) {
        smallCandidate
      } else {
        largeCandidate
      }
    }
  }


}



primeFactorOf(BigInt("600851475143"))

BigIntSqrt(16).sqrt


