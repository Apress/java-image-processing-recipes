import tornadofx.*
import javafx.application.Application
import javafx.scene.layout.*

object kotlin2 {

class HelloFXWorld : View() {
  override val root = VBox()

  init {
  	vbox {
		button("Press The button") {
        	action { println("Coffee is ready") }
        }
  	}	
  }
}

class MyApp: App(HelloFXWorld::class)
    @JvmStatic fun main(args: Array<String>) {
      Application.launch(MyApp::class.java, *args)
    }
}