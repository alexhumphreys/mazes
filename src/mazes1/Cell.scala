package mazes1

class Cell(rowc: Int, columnc: Int) {
  var row: Int = rowc
  var column: Int = columnc
  var north, south, east, west: Cell = null
  
  val links = scala.collection.mutable.Map[Cell,Boolean]()
  
  def link(cell: Cell, bidi:Boolean = true) : Cell = {
    links(cell) = true
    if (bidi) cell.link(this, false)
    this
  }
  
  def unlink(cell: Cell, bidi:Boolean = true) : Cell = {
    links.remove(cell)
    if (bidi) cell.unlink(this, false)
    this
  }
  
  def link_keys : Iterable[Cell] = {
    links.keys
  }
  
  def isLinked(cell: Cell) : Boolean = {
    links.contains(cell)
  }
}