package mazes1

object BinaryTreeMaze {
  def on(grid: Grid) : Grid = {
    grid.eachCell foreach { cell =>
      val neighbors = new Array[Option[Cell]](2)
      
      neighbors(0) = cell.north
      neighbors(1) = cell.east
      
      val r = scala.util.Random
      val index = r.nextInt(neighbors.length)
      val neighbor = neighbors(index)
      
      if (neighbor.isDefined) cell.link(neighbor.get)
    }
    
    grid
  }
}