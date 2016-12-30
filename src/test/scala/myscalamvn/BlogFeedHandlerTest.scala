package myscalamvn

import org.junit.Assert._
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

@RunWith(classOf[JUnitRunner])
class BlogFeedHandlerTest extends FlatSpec with ShouldMatchers {
  "the thingy" should "do what I expect it to do" in {
    val someValue = false;

    assertFalse( someValue )
  }
}