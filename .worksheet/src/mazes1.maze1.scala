package mazes1

object maze1 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(61); 
  
  val grid = new Grid(3, 3);System.out.println("""grid  : mazes1.Grid = """ + $show(grid ));$skip(29); val res$0 = 
 	
 	BinaryTreeMaze.on(grid);System.out.println("""res0: mazes1.Grid = """ + $show(res$0))}

 	
}
