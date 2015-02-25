package mazes1

class Cell(rowc: Int, columnc: Int) {
  val row: Int = rowc
  val column: Int = columnc
  //var north, south, east, west: Option[Cell] = None
  
  val links = scala.collection.mutable.ArrayBuffer[Cell]()
  
  def link(cell: Cell, bidi:Boolean = true) : Cell = {
    links += cell
    if (bidi) cell.link(this, false)
    this
  }
  
  def unlink(cell: Cell, bidi:Boolean = true) : Cell = {
    links - cell
    if (bidi) cell.unlink(this, false)
    this
  }
  
  def isLinked(cell: Cell) : Boolean = {
    links.contains(cell)
  }
  
  def bitLinks : Int = {
    // nums.aggregate(0)((acc, x) => acc + x.length, _ + _)
    links.aggregate(0)((acc, cell) => 
      if (this.row > cell.row) { // North
        acc + 1
      } else if (this.column < cell.column) {  // East
        acc + 2
      } else if (this.row < cell.row) { // South
        acc + 4
      } else { // East
        acc + 8
      }
    ,_ + _)
  }
  
  override def toString(): String = "(" + row + ", " + column + ")";
  
}