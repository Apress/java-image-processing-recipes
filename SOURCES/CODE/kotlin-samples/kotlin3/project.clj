(defproject kotlin3 "0.1.0-SNAPSHOT"
  :repositories [["vendredi" "http://hellonico.info:8081/repository/hellonico/"]]
  :plugins [
  [lein-kotlin "0.0.2"]
  [lein-auto "0.1.3"]
  ]
  :prep-tasks ["kotlin"]
  :main "kotlin3"
  :auto {:default {:file-pattern #"\.(kt)$"}}
  
  :profiles {:dev {:dependencies [[org.jetbrains.kotlin/kotlin-runtime "1.1.4-3"]]}}
  :kotlin-source-path "src"
  :kotlin-java-version "1.8"
  :dependencies [
   [org.clojure/clojure "1.8.0"]
   [opencv/opencv "3.3.0-rc"]
   [opencv/opencv-native "3.3.0-rc" :classifier "osx"]
   ; [opencv/opencv-native "3.3.0-rc" :classifier "linux"]
   ; [opencv/opencv-native "3.3.0-rc" :classifier "win"]
  ]
  )