package mazes1

import java.awt.image.BufferedImage
import java.awt.{Graphics2D,Color,Font,BasicStroke}
import java.awt.geom._

class Draw {
  
  val DirectionMap = Map(
    1 -> "\u2575",
    2 -> "\u2576",
    3 -> "\u2514",
    4 -> "\u2577",
    5 -> "\u2502",
    6 -> "\u250c",
    7 -> "\u251c",
    8 -> "\u2574",
    9 -> "\u2518",
    10 -> "\u2500",
    11 -> "\u2534",
    12 -> "\u2510",
    13 -> "\u2524",
    14 -> "\u252c",
    15 -> "\u253c"
  )
  
  def toPng(grid: Grid) : Boolean = {

	  // Size of image
    val cellSize = 100
	  val size = (grid.rows * cellSize, grid.columns * cellSize)

	  // create an image
		val canvas = new BufferedImage(size._1 + 1, size._2 + 1, BufferedImage.TYPE_INT_RGB)

	  // get Graphics2D for the image
	  val g = canvas.createGraphics()

	  // clear background
	  g.setColor(Color.WHITE)
	  g.fillRect(0, 0, canvas.getWidth, canvas.getHeight)

	  // enable anti-aliased rendering (prettier lines and circles)
	  // Comment it out to see what this does!
	  g.setRenderingHint(java.awt.RenderingHints.KEY_ANTIALIASING, 
			  java.awt.RenderingHints.VALUE_ANTIALIAS_ON)
    g.setStroke(new BasicStroke())  // reset to default
    g.setColor(new Color(0, 0, 255)) // same as Color.BLUE
        
    grid.eachCell.foreach { cell =>
      val x1 = cell.column * cellSize
      val y1 = cell.row * cellSize
      val x2 = (cell.column + 1) * cellSize 
      val y2 = (cell.row + 1) * cellSize
      
      
      
      if (!grid.northOf(cell).isDefined) g.draw(new Line2D.Double(x1, y1, x2, y1))
      
      if (!grid.westOf(cell).isDefined) g.draw(new Line2D.Double(x1, y1, x1, y2))
      
      if (grid.eastOf(cell).isDefined && !cell.isLinked(grid.eastOf(cell).get)) g.draw(new Line2D.Double(x2, y1, x2, y2)) 
      
      if (grid.southOf(cell).isDefined && !cell.isLinked(grid.southOf(cell).get)) g.draw(new Line2D.Double(x1, y2, x2, y2)) 
      
      if (!grid.southOf(cell).isDefined) g.draw(new Line2D.Double(x1, y2, x2, y2))
      
      println(!grid.eastOf(cell).isDefined)
      if (!grid.eastOf(cell).isDefined) g.draw(new Line2D.Double(x2, y1, x2, y2))
      
    } 

			  // write image to a file
			  javax.imageio.ImageIO.write(canvas, "png", new java.io.File("/Users/alex/Documents/workspace/mazes2drawing.png"))

  }
  
  def toBits(grid: Grid) {
      grid.grid.foreach { row =>
        row.map( cell => print(DirectionMap(cell.bitLinks)) )
        println
      }
      grid.grid.foreach { row =>
        row.map( cell => print(cell.bitLinks) )
        println
      }
   }
  

}