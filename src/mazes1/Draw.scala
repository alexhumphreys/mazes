package mazes1

import java.awt.image.BufferedImage
import java.awt.{Graphics2D,Color,Font,BasicStroke}
import java.awt.geom._

class Draw {
  
  def toPng : Boolean = {

	  // Size of image
	  val size = (500, 500)

	  // create an image
		val canvas = new BufferedImage(size._1, size._2, BufferedImage.TYPE_INT_RGB)

	  // get Graphics2D for the image
	  val g = canvas.createGraphics()

	  // clear background
	  g.setColor(Color.WHITE)
	  g.fillRect(0, 0, canvas.getWidth, canvas.getHeight)

	  // enable anti-aliased rendering (prettier lines and circles)
	  // Comment it out to see what this does!
	  g.setRenderingHint(java.awt.RenderingHints.KEY_ANTIALIASING, 
			  java.awt.RenderingHints.VALUE_ANTIALIAS_ON)
        
        each_cell do |cell|
x1 = cell.column * cell_size
y1 = cell.row * cell_size
x2 = (cell.column + 1) * cell_size y2 = (cell.row + 1) * cell_size
img.line(x1, y1, x2, y1, wall) unless cell.north img.line(x1, y1, x1, y2, wall) unless cell.west
img.line(x2, y1, x2, y2, wall) unless cell.linked?(cell.east)
img.line(x1, y2, x2, y2, wall) unless cell.linked?(cell.south) end

// draw a line
g.setStroke(new BasicStroke())  // reset to default
g.setColor(new Color(0, 0, 255)) // same as Color.BLUE
g.draw(new Line2D.Double(50.0, 50.0, 250.0, 400.0))


			  // draw two filled circles
			  g.setColor(Color.RED)
			  g.fill(new Ellipse2D.Double(30.0, 30.0, 40.0, 40.0))
			  g.fill(new Ellipse2D.Double(230.0, 380.0, 40.0, 40.0))

			  // write image to a file
			  javax.imageio.ImageIO.write(canvas, "png", new java.io.File("/Users/alex/Documents/workspace/mazes1drawing.png"))

  }

}