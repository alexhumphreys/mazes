package mazes1

object maze1 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(61); 
  
  val grid = new Grid(3, 3);System.out.println("""grid  : mazes1.Grid = """ + $show(grid ));$skip(37); 
 	
  var x = BinaryTreeMaze.on(grid);System.out.println("""x  : mazes1.Grid = """ + $show(x ));$skip(15); val res$0 = 

	x.toString();System.out.println("""res0: String = """ + $show(res$0))}
}
