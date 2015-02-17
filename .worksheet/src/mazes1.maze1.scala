package mazes1

object maze1 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(61); 
  
  val grid = new Grid(4, 4);System.out.println("""grid  : mazes1.Grid = """ + $show(grid ));$skip(34); 
  var x = BinaryTreeMaze.on(grid);System.out.println("""x  : mazes1.Grid = """ + $show(x ));$skip(19); 
  val y = new Draw;System.out.println("""y  : mazes1.Draw = """ + $show(y ));$skip(13); val res$0 = 
  y.toPng(x);System.out.println("""res0: Boolean = """ + $show(res$0));$skip(29); 
 
  val first = x.grid(0)(0)
 
  import Direction._;System.out.println("""first  : mazes1.Cell = """ + $show(first ));$skip(62); val res$1 = 
  x.fetchCellByDirection(first, South);System.out.println("""res1: Option[mazes1.Cell] = """ + $show(res$1))}
}
