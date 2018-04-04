import org.opencv.core.*
import org.opencv.core.CvType.*

import org.opencv.imgcodecs.Imgcodecs.*
import org.opencv.imgproc.Imgproc.*
import org.opencv.core.Core.*


object kotlin3 {
	init {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME)
    }

    @JvmStatic fun main(args: Array<String>) {
        /*
        println("hello opencv")

        val mat = Mat.eye(5, 5, CV_8UC1)
        println(mat.dump())
        */
        println("blurring")
        val mat = imread("resources/cat.jpg")
        blur(mat,mat, Size(31.0,31.0))
        imwrite("target/blurredcat.jpg", mat)
    }
}