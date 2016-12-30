package myscalamvn

/*
* ScalaTest facilitates different styles of testing by providing traits you can mix together to get the behavior and syntax you prefer.
* A few examples are included here, or more information, visit: http://www.scalatest.org/
* One way to use ScalaTest is to help make JUnit or TestNG tests more clear and concise. Here's an example:
*/
import scala.collection.mutable.Stack
import org.scalatest.Assertions
import org.junit.Test

class StackSuite extends Assertions {

  @Test
  def stackShouldPopValuesIinLastInFirstOutOrder() {
    val stack = new Stack[Int]
    stack.push(1)
    stack.push(2)
    assert(stack.pop() === 2)
    assert(stack.pop() === 1)
  }

  @Test
  def stackShouldThrowNoSuchElementExceptionIfAnEmptyStackIsPopped() {
    val emptyStack = new Stack[String]
    intercept[NoSuchElementException] {
      emptyStack.pop()
    }
  }
}


/*
* Here's an example of a FunSuite with ShouldMatchers mixed in:
*/
import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class ListSuite extends FunSuite with ShouldMatchers {

  test("An empty list should be empty") {
    List() should be ('empty)
    Nil should be ('empty)
  }

  test("A non-empty list should not be empty") {
    List(1, 2, 3) should not be ('empty)
    List("fee", "fie", "foe", "fum") should not be ('empty)
  }

  test("A list's length should equal the number of elements it contains") {
    List() should have length (0)
    List(1, 2) should have length (2)
    List("fee", "fie", "foe", "fum") should have length (4)
  }
}

