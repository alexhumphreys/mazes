package mazes1

object BinaryTreeMaze {
  
  def on(grid: Grid) : Grid = {
    grid.eachCell foreach { cell =>     
      val neighbors = List(grid.northOf(cell), grid.eastOf(cell)).flatten    
      if (neighbors.length > 0) cell.link(getRandomCell(neighbors))
    }
    grid
  }
  
  def getRandomCell(list: List[Cell]) : Cell = {
    if (list.length == 1) return list(0) 
    val random = new scala.util.Random
    list(random.nextInt(list.length))
  }  
}