(ns opencv3.ok
	(:require [opencv3.core :refer :all]))

(defn -main [& args]
  (println "Using OpenCV Version: " opencv3.core/VERSION "..")
	(->
    (imread "resources/cat.jpg")
    (cvt-color! COLORMAP_JET)
    (imwrite "grey-neko-2.jpg")
    (println "A new gray neko has arise!")))

(->
	(imread "resources/cat.jpg")
	(resize! (new-size 150 100))
	(cvt-color! COLORMAP_JET)
	(imwrite "output.jpg"))
