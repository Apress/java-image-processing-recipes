import java.util.Arrays
import org.opencv.core._
import org.opencv.core.CvType._
import org.opencv.core.Core._
import org.opencv.imgproc.Imgproc._
import org.opencv.imgcodecs.Imgcodecs._
import clojure.lang.RT.loadLibrary

object SimpleOpenCV3 {

 	  loadLibrary(Core.NATIVE_LIBRARY_NAME)

    def main(args: Array[String]) {
      val cat = imread("images/cat3.jpg")

      cvtColor(cat,cat,COLOR_RGB2GRAY)
      Canny(cat,cat, 220.0,230.0,5,true)

      val cat2 = cat.clone()
      bitwise_not(cat2,cat2)

      val target = new Mat
      vconcat(Arrays.asList(cat,cat2), target)

      imwrite("output/canny-cat.png", target)
    }

}
