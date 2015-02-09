package mazes1

object maze1 {
  
  val grid = new Grid(3, 3)                       //> grid  : mazes1.Grid = +---+---+---+()|         ()++++()|         ()++++()|   
                                                  //|       ()++++()
 	
  var x = BinaryTreeMaze.on(grid)                 //> x  : mazes1.Grid = +---+---+---+()|               ()+++   +()|               
                                                  //| ()++   ++()|            ()++++()

	x.toString()                              //> res0: String = +---+---+---+()|               ()+++   +()|               ()+
                                                  //| +   ++()|            ()++++()
}