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

  import Direction._
  
  def northOf(cell: Cell) : Option[Cell] = {
    Option(grid(cell.row - 1)(cell.column))
  }
  def southOf(cell: Cell) : Option[Cell] = {
    Option(grid(cell.row + 1)(cell.column))
  }
  def eastOf(cell: Cell) : Option[Cell] = {
    Option(grid(cell.row)(cell.column -1))
  }
  def westOf(cell: Cell) : Option[Cell] = {
    Option(grid(cell.row)(cell.column + 1))
  }
  def fetchCellByDirection(cell: Cell, dir : Direction) : Option[Cell] = {
    val xy = dir match {
      case North => (-1, 0)
      case South => (1, 0)
      case East => (0, -1)
      case _ => (0, 1)
    }
    
    try { 
      Option(grid(cell.row + xy._1)(cell.column + xy._2))
    } catch {
      case e1: ArrayIndexOutOfBoundsException =>
        None
    }
  }
}