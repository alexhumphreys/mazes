package mazes1

object maze1 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(75); 
  println("Welcome to the Scala worksheets");$skip(39); 
  var grid = Array.ofDim[Cell](10, 10);System.out.println("""grid  : Array#774[Array#774[mazes1#25.Cell#17112]] = """ + $show(grid ));$skip(37); 
  

	
 	var w = Array("x", "y", "z");System.out.println("""w  : Array#774[String#199] = """ + $show(w ));$skip(31); 
 	var y = Array("q", "p", "r");System.out.println("""y  : Array#774[String#199] = """ + $show(y ));$skip(37); 
 	var x = Array[Array[String]](w, y);System.out.println("""x  : Array#774[Array#774[String#1483624]] = """ + $show(x ));$skip(15); val res$0 = 
 	
 	x.flatten;System.out.println("""res0: Array#774[String#1483624] = """ + $show(res$0));$skip(17); val res$1 = 
 	
	
 	x.indices;System.out.println("""res1: scala#23.collection#2620.immutable#5667.Range#8017 = """ + $show(res$1))}
}
