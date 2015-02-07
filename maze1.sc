package mazes1

object maze1 {
  
  val grid = new Grid(3, 3)                       //> grid  : mazes1.Grid = +---+---+---+
                                                  //| |         /n++++/n|         /n++++/n|         /n++++/n
 	
 	BinaryTreeMaze.on(grid)                   //> res0: mazes1.Grid = +---+---+---+
                                                  //| |            /n++++/n|               /n++   ++/n|            /n++++/n

 	
}