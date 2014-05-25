import org.scalatest.FlatSpec

class MainSpec extends FlatSpec {
  "An empty Set" shoud "have size 0" in {
    assert(Set.empty.size == 0)
  }
}

