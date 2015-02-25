package mazes1

object SideWinder {
  def on(grid : Grid) : Grid = {
    grid.grid.foreach { row =>
      var run = scala.collection.mutable.MutableList[Cell]()
      
      row foreach { cell =>
        run += cell
        
        val at_eastern_boundary = grid.eastOf(cell).isDefined
        val at_northern_boundary = grid.northOf(cell).isDefined
        
        
      }
    }
    grid
  }
}