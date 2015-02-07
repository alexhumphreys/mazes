package mazes1

class Grid(rowsc: Int, columnsc: Int) {
  var rows: Int = rowsc
  var columns: Int = columnsc

  var grid: Array[Array[Cell]] = prepareGrid
  configureCells
  
  def prepareGrid : Array[Array[Cell]] = {
    var x = new Array[Array[Cell]](rows)
  
    x.indices.foreach { row =>
      var y = new Array[Cell](columns)
      y.indices.foreach { column =>
        var cell = new Cell(row, column)
        y(column) = cell
      }
      x(row) = y
    }
    x
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
    val row = r.nextInt(rows)
    val col = r.nextInt(grid(row).length)
    
    grid(row)(col)
  }
  
  def size : Int = {
    rows * columns
  }
  
  override def toString(): String = {
    var output = "+" + "---+" * columns + "\n"
    
    grid.foreach { row => 
      var top = "|"
      var bottom = "+"
      
      row.foreach { cell =>
        var body = "   " // <-- that's THREE (3) spaces!
        var eastBoundary = ""
        
        if (cell.east.isDefined) {
          if (cell.isLinked(cell.east.get)) eastBoundary = "   " else "|"
        }
        top += (body + eastBoundary)
        
        var southBoundary = ""
        if (cell.south.isDefined) {
          if (cell.isLinked(cell.south.get)) southBoundary = "   " else "---"
        }
        bottom += (southBoundary + "+")
      }
      
      output += (top + "/n")
      output += (bottom + "/n")
    }
    
    output
  }
}