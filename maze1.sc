package mazes1

object maze1 {
  
  val grid = new Grid(4, 4)                       //> grid  : mazes1.Grid = mazes1.Grid@33aae94f
  var x = BinaryTreeMaze.on(grid)                 //> x  : mazes1.Grid = mazes1.Grid@33aae94f
  
  
  
  val y = new Draw                                //> y  : mazes1.Draw = mazes1.Draw@3ad3c6a3
 
  
  y.toPng(x)                                      //> false
                                                  //| false
                                                  //| false
                                                  //| true
                                                  //| false
                                                  //| false
                                                  //| false
                                                  //| true
                                                  //| false
                                                  //| false
                                                  //| false
                                                  //| true
                                                  //| false
                                                  //| false
                                                  //| false
                                                  //| true
                                                  //| res0: Boolean = true
                        
                               
  val first = x.grid(0)(0)                        //> first  : mazes1.Cell = (0, 0)
  x.northOf(first).isDefined                      //> res1: Boolean = false
  first.links.length                              //> res2: Int = 1
  first.links                                     //> res3: scala.collection.mutable.ArrayBuffer[mazes1.Cell] = ArrayBuffer((0, 1)
                                                  //| )
  first.bitLinks                                  //> res4: Int = 2
  y.toBits(x)                                     //> ????
                                                  //| ????
                                                  //| ????
                                                  //| ????
                                                  //| 2101412
                                                  //| 21495
                                                  //| 29613
                                                  //| 21091
        sys.props("file.encoding")                //> res5: String = MacRoman/
  }