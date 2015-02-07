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
      
      cell.north = if (row != 0) grid(row - 1)(col) else null
      cell.south = if (row != rows) grid(row + 1)(col) else null
      cell.west =  if (col != 0) grid(row)(col - 1) else null
      cell.east =  if (col != columns)grid(row)(col + 1) else null
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
  
  
}