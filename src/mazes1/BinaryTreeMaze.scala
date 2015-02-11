package mazes1

object BinaryTreeMaze {
  def on(grid: Grid) : Grid = {
    grid.eachCell foreach { cell =>
      
      println(cell)
      
      val neighbors = new Array[Option[Cell]](2)
      
      neighbors(0) = cell.north
      neighbors(1) = cell.east
      
      println(neighbors)
      
      val r = scala.util.Random
      val index = r.nextInt(neighbors.length)
      val neighbor = neighbors(index)
      
      println("index", index)
      println("neighbor defined", neighbor.isDefined)
      
      if (neighbor.isDefined) {
        cell.link(neighbor.get)
      } else {
        val newIndex = if (index == 0) 1 else 0;
        if (neighbors(newIndex).isDefined) cell.link(neighbors(newIndex).get)
      }
        
      println("links", cell.links)
    }
    
    grid
  }
}