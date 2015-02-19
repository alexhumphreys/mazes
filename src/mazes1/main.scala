package mazes1

object main {
  def main(args:Array[String]):Unit = {
     val grid = new Grid(4, 4)                       //> grid  : mazes1.Grid = mazes1.Grid@97494c8
  var x = BinaryTreeMaze.on(grid)                 //> x  : mazes1.Grid = mazes1.Grid@97494c8
  val y = new Draw                                //> y  : mazes1.Draw = mazes1.Draw@20992bae
  y.toPng(x)                                      //> res0: Boolean = true
  val first = x.grid(0)(0)                        //> first  : mazes1.Cell = (0, 0)
  x.northOf(first).isDefined                      //> res1: Boolean = false
  first.links.length                              //> res2: Int = 2                                  //> res3: scala.collection.mutable.ArrayBuffer[mazes1.Cell] = ArrayBuffer((0, 1)
                                                  //| , (1, 0))
  first.bitLinks                                  //> res4: Int = 6
  y.toBits(x)      
  }
}