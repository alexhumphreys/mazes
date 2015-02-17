package mazes1

object maze1 {
  
  val grid = new Grid(4, 4)                       //> grid  : mazes1.Grid = mazes1.Grid@276a38b5
  var x = BinaryTreeMaze.on(grid)                 //> x  : mazes1.Grid = mazes1.Grid@276a38b5
  val y = new Draw                                //> y  : mazes1.Draw = mazes1.Draw@3cc262
  y.toPng(x)                                      //> res0: Boolean = true
 
  val first = x.grid(0)(0)                        //> first  : mazes1.Cell = (0, 0)
 
  import Direction._
  x.fetchCellByDirection(first, South)            //> res1: Option[mazes1.Cell] = Some((1, 0))/
}