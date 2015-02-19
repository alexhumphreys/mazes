package mazes1

object maze1 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(61); 
  
  val grid = new Grid(4, 4);System.out.println("""grid  : mazes1.Grid = """ + $show(grid ));$skip(34); 
  var x = BinaryTreeMaze.on(grid);System.out.println("""x  : mazes1.Grid = """ + $show(x ));$skip(19); 
  val y = new Draw;System.out.println("""y  : mazes1.Draw = """ + $show(y ));$skip(13); val res$0 = 
  y.toPng(x);System.out.println("""res0: Boolean = """ + $show(res$0));$skip(27); 
  val first = x.grid(0)(0);System.out.println("""first  : mazes1.Cell = """ + $show(first ));$skip(29); val res$1 = 
  x.northOf(first).isDefined;System.out.println("""res1: Boolean = """ + $show(res$1));$skip(21); val res$2 = 
  first.links.length;System.out.println("""res2: Int = """ + $show(res$2));$skip(14); val res$3 = 
  first.links;System.out.println("""res3: scala.collection.mutable.ArrayBuffer[mazes1.Cell] = """ + $show(res$3));$skip(17); val res$4 = 
  first.bitLinks;System.out.println("""res4: Int = """ + $show(res$4));$skip(14); 
  y.toBits(x);$skip(35); val res$5 = 
        sys.props("file.encoding");System.out.println("""res5: String = """ + $show(res$5))}
  }
