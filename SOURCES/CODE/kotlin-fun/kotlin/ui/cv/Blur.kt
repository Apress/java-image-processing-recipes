package ui.cv;

import org.opencv.core.*
import org.opencv.imgproc.Imgproc.*
import org.opencv.imgcodecs.Imgcodecs.*
import clojure.lang.RT
import tornadofx.*
import javafx.application.Application
import javafx.scene.layout.*
import javafx.scene.paint.Color
import javafx.application.Platform
import javafx.beans.property.SimpleIntegerProperty
import javafx.beans.property.SimpleObjectProperty
import javafx.geometry.Pos
import javafx.scene.image.Image

class CounterView : View() {
    override val root = BorderPane()
    val counter = SimpleIntegerProperty(1)
    val imageObj = SimpleObjectProperty(Image("/cat.jpg"))

    val source = imread("images/cat.jpg")

    init {
        title = "Blur"

        with (root) {
            style {
                padding = box(20.px)
            }

            center {
                vbox(10.0) {
                    alignment = Pos.CENTER

                    label() {
                        bind(counter)
                        style { fontSize = 25.px }
                    }
                    imageview(imageObj) {
                        fitWidth = 150.0
                        fitHeight = 100.0
                    }

                    button("Click to increment") {
                        action {
                         increment()
                         blurImage()
                        }
                    }

                    button("Click to decrement") {
                        action {
                         decrement()
                         blurImage()
                        }
                    }
                }
            }
        }
    }
    fun blurImage() {
      val result_mat = Mat()
      blur(source, result_mat, Size(counter.value.toDouble(),counter.value.toDouble()))

      //imwrite("output/temp_cat.jpg", source)
      //imageObj.value = Image("file:output/temp_cat.jpg")

      val mat_of_bytes = MatOfByte()
      imencode(".jpg", result_mat, mat_of_bytes)
      imageObj.value = Image(java.io.ByteArrayInputStream(mat_of_bytes.toArray()))
    }

    fun increment() {
        counter.value += 6
    }

    fun decrement() {
        if(counter.value>6)
          counter.value -= 6
    }
}


class MyBlurApp : App(CounterView::class)


object Blur {
    @JvmStatic fun main(args: Array<String>) {
      RT.loadLibrary(Core.NATIVE_LIBRARY_NAME)
      Application.launch(MyBlurApp::class.java, *args)
    }
}
