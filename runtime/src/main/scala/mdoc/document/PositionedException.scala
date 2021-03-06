package mdoc.document

import scala.util.control.NoStackTrace

@deprecated("Use DocumentException instead", "2.1.1")
final class PositionedException(
    val section: Int,
    val pos: RangePosition,
    val cause: Throwable
) extends Exception(pos.toString, cause)
    with NoStackTrace
