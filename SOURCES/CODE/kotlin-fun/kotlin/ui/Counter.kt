package ui;

import tornadofx.*
import javafx.application.Application
import javafx.scene.layout.*
import javafx.beans.property.SimpleIntegerProperty
import javafx.geometry.Pos

class CounterView : View() {
  override val root = BorderPane()
  val counter = SimpleIntegerProperty()

  init {
    title = "Counter"

    with (root) {
      center {
        vbox(10.0) {
          alignment = Pos.CENTER

          label() {
            bind(counter)
            style { fontSize = 25.px }
          }

          button("Click to increment") {
            action {increment()}}}}}}

  fun increment() {counter.value += 1} 
}

class CounterApp : App(CounterView::class)

object Counter {
  @JvmStatic fun main(args: Array<String>) {
    Application.launch(CounterApp::class.java, *args)
  }
}
