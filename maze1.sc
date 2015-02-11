package mazes1

object maze1 {
  
  val grid = new Grid(4, 4)                       //> grid  : mazes1.Grid = +---+---+---+---+()|            ()+++++()|            (
                                                  //| )+++++()|            ()+++++()|            ()+++++()
  var x = BinaryTreeMaze.on(grid)                 //> (0, 0)
                                                  //| [Lscala.Option;@3bc0f2e5
                                                  //| (index,0)
                                                  //| (neighbor defined,false)
                                                  //| (links,Map((0, 1) -> true))
                                                  //| (0, 1)
                                                  //| [Lscala.Option;@23abcc03
                                                  //| (index,0)
                                                  //| (neighbor defined,false)
                                                  //| (links,Map((0, 0) -> true, (0, 2) -> true))
                                                  //| (0, 2)
                                                  //| [Lscala.Option;@63deeb40
                                                  //| (index,1)
                                                  //| (neighbor defined,true)
                                                  //| (links,Map((0, 3) -> true, (0, 1) -> true))
                                                  //| (0, 3)
                                                  //| [Lscala.Option;@4026e9f9
                                                  //| (index,1)
                                                  //| (neighbor defined,false)
                                                  //| (links,Map((0, 2) -> true))
                                                  //| (1, 0)
                                                  //| [Lscala.Option;@3acafb56
                                                  //| (index,1)
                                                  //| (neighbor defined,true)
                                                  //| (links,Map((1, 1) -> true))
                                                  //| (1, 1)
                                                  //| [Lscala.Option;@643ae941
                                                  //| (index,1)
                                                  //| (neighbor defined,true)
                                                  //| (links,Map((1, 2) -> true, (1, 0) -> true))
                                                  //| (1, 2)
                                                  //| [Lscala.Option;@57a7ddcf
                                                  //| (index,0)
                                                  //| (neighbor defined,true)
                                                  //| (links,Map((1, 1) -> true, (0, 2) -> true))
                                                  //| (1, 3)
                                                  //| [Lscala.Option;@4dd36dfe
                                                  //| (index,1)
                                                  //| (neighbor defined,false)
                                                  //| (links,Map((0, 3) -> true))
                                                  //| (2, 0)
                                                  //| [Lscala.Option;@73da669c
                                                  //| (index,1)
                                                  //| (neigh
                                                  //| Output exceeds cutoff limit.
  val y = new Draw                                //> y  : mazes1.Draw = mazes1.Draw@506f9b8e
  y.toPng(x)                                      //> res0: Boolean = true/

}