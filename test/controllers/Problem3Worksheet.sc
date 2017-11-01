import scala.annotation.tailrec

def primeFactorOf (n: Int): Unit = {

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
def isPrime3Rec(n:Int, i: Int): Boolean = {
  (n % i != 0) && ((i * i > n) || isPrime3Rec(n, i + 2))
}

