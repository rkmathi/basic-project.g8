import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.matchers.ShouldMatchers
import org.scalatest.Spec

@RunWith(classOf[JUnitRunner])
class MainTest extends Spec with ShouldMatchers {
  describe("1 + 1") {
    it("should be 2") {
      (1 + 1) should be(2)
    }
  }
}
