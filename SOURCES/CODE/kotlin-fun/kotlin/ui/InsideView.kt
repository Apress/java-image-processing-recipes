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

class MyView : View(){
  override val root = Form()

  init{
    with(root){
      title = "TornadoFX demo"
      fieldset{
        field("Hello tornadofx!")
      }

      button("Press me").action{
        println("Button Pressed!")
      }

      button("Close").action{
        Platform.exit()
      }

      button("Open").action{
          openInternalWindow(MyAnotherView::class)
      }
    }
  }
}

class MyAnotherView : View(){
  override val root = Form()

  init{
    with(root){
      title = "another view"
      fieldset("This is another view")
    }
  }
}

class InsideApp : App(MyView::class)

object InsideView {
    @JvmStatic fun main(args: Array<String>) {
      Application.launch(InsideApp::class.java, *args)
    }
}
