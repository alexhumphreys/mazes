package mazes1

class Grid(rowsc: Int, columnsc: Int) {
  val rows: Int = rowsc
  val columns: Int = columnsc

  val grid: Array[Array[Cell]] = prepareGrid
  configureCells
  
  def prepareGrid : Array[Array[Cell]] = {
    val grid2d = Array.ofDim[Cell](rows, columns)
    val allCells = for(i <- (0 until (rows)); j <- 0 until (columns)) yield new Cell(i, j)
    
    allCells foreach { cell =>
      grid2d(cell.row)(cell.column) = cell
    }
    grid2d
  }
  
  def configureCells {
    eachCell foreach { cell =>
      val row = cell.row
      val col = cell.column
      
      if (row != 0)           cell.north = Option(grid(row - 1)(col))
      if (row != rows - 1)    cell.south = Option(grid(row + 1)(col))
      if (col != 0)           cell.west =  Option(grid(row)(col - 1))
      if (col != columns - 1) cell.east = Option(grid(row)(col + 1))
    }
  }
  
  def eachCell : Array[Cell] = {
    grid.flatten
  }
  
  def randomCell : Cell = {
    val r = scala.util.Random
    eachCell(r.nextInt(eachCell.length))
  }
  
  def size : Int = {
    rows * columns
  }
  
  override def toString(): String = {
    var output = "+" + "---+" * columns + newline
    
    grid.foreach { row => 
      var top = "|"
      var bottom = "+"
      
      row.foreach { cell =>
        var body = "   " // <-- that's THREE (3) spaces!
        var eastBoundary = ""
        
        if (cell.east.isDefined) {
          if (cell.isLinked(cell.east.get)) eastBoundary = "   " else "|"
        }
        top += body + eastBoundary
        
        var southBoundary = ""
        if (cell.south.isDefined) {
          if (cell.isLinked(cell.south.get)) southBoundary = "   " else "---"
        }
        bottom += (southBoundary + "+")
      }
      
      output += top + newline
      output += bottom + newline
    }
    
    output
  }
  
  def newline {
    sys.props("line.separator")
  }
}