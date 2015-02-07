package mazes1

object maze1 {
  println("Welcome to the Scala worksheets")      //> Welcome to the Scala worksheets
  var grid = Array.ofDim[Cell](10, 10)            //> grid  : Array#774[Array#774[mazes1#25.Cell#17112]] = Array(Array(null, null,
                                                  //|  null, null, null, null, null, null, null, null), Array(null, null, null, nu
                                                  //| ll, null, null, null, null, null, null), Array(null, null, null, null, null,
                                                  //|  null, null, null, null, null), Array(null, null, null, null, null, null, nu
                                                  //| ll, null, null, null), Array(null, null, null, null, null, null, null, null,
                                                  //|  null, null), Array(null, null, null, null, null, null, null, null, null, nu
                                                  //| ll), Array(null, null, null, null, null, null, null, null, null, null), Arra
                                                  //| y(null, null, null, null, null, null, null, null, null, null), Array(null, n
                                                  //| ull, null, null, null, null, null, null, null, null), Array(null, null, null
                                                  //| , null, null, null, null, null, null, null))
  

	
 	var w = Array("x", "y", "z")              //> w  : Array#774[String#199] = Array(x, y, z)
 	var y = Array("q", "p", "r")              //> y  : Array#774[String#199] = Array(q, p, r)
 	var x = Array[Array[String]](w, y)        //> x  : Array#774[Array#774[String#1483624]] = Array(Array(x, y, z), Array(q, p
                                                  //| , r))
 	
 	x.flatten                                 //> res0: Array#774[String#1483624] = Array(x, y, z, q, p, r)
 	
	
 	x.indices                                 //> res1: scala#23.collection#2620.immutable#5667.Range#8017 = Range(0, 1)
}