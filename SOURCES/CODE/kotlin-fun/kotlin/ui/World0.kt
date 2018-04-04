package ui;

import org.opencv.core.*
import org.opencv.imgproc.Imgproc.*
import org.opencv.imgcodecs.Imgcodecs.*
import clojure.lang.RT
import tornadofx.*
import javafx.application.Application
import javafx.scene.layout.*
import javafx.scene.paint.Color
import javafx.application.Platform
import javafx.beans.property.SimpleStringProperty
import javafx.beans.property.SimpleIntegerProperty
import javafx.beans.property.SimpleObjectProperty
import javafx.geometry.Pos
import javafx.scene.image.Image

class HelloWorld0 : View() {
    override val root = VBox()
    val imagePath = "cat.jpg"

    init {
        with(root) {
          title = "Image in Frame"
          imageview(imagePath) {
            fitHeight = 160.0
            fitWidth = 200.0
          }
        }
    }
}

class MyApp0: App(HelloWorld0::class)

object World0 {
    @JvmStatic fun main(args: Array<String>) {
      Application.launch(MyApp0::class.java, *args)
    }
}
