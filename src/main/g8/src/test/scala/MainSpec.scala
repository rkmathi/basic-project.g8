import org.scalatest.FlatSpec

class MainSpec extends FlatSpec {
  "\"Hello, world!\"" should "have size 13" in {
    val str = "Hello, world!"
    assert(str.size == 13)
  }
}

