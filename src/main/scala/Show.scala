
trait Show[A] {
  def show(a: A): String
}

object Show {
  val intShow: Show[Int] = new Show[Int] {
    def show(int: Int): String = int.toString
  }

  val longShow: Show[Long] = new Show[Long] {
    def show(long: Long): String = long.toString
  }
  val doubleShow: Show[Double] = new Show[Double] {
    def show(double: Double): String = double.toString
  }

  case class Position(x: Int, y: Int)

  val positionShow: Show[Position] = new Show[Position] {
    def show(pos: Position): String = s"Pos(x: ${pos.x}, y: ${pos.y})"
  }
}