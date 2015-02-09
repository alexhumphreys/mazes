package mazes1

object maze1 {
  
  val grid = new Grid(3, 3)                       //> grid  : mazes1.Grid = +---+---+---+()|         ()++++()|         ()++++()|   
                                                  //|       ()++++()
  var x = BinaryTreeMaze.on(grid)                 //> x  : mazes1.Grid = +---+---+---+()|               ()+   +   +   +()|         
                                                  //| ()+++   +()|               ()++++()
 
  val y = new Draw                                //> y  : mazes1.Draw = mazes1.Draw@42787d6a

  y.doSomething                                   //> res0: Boolean = true/

}