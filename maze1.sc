package mazes1

object maze1 {
  
  val grid = new Grid(4, 4)                       //> grid  : mazes1.Grid = +---+---+---+---+()|            ()+++++()|            (
                                                  //| )+++++()|            ()+++++()|            ()+++++()
  var x = BinaryTreeMaze.on2(grid)                //> x  : mazes1.Grid = +---+---+---+---+()|                     ()++++   +()|    
                                                  //|                  ()++   +   +   +()|               ()+   +++   +()|          
                                                  //|         ()+++++()
  val y = new Draw                                //> y  : mazes1.Draw = mazes1.Draw@783c342b
  y.toPng(x)                                      //> res0: Boolean = true-
}