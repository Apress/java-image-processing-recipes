(defproject kotlin2 "0.1.0-SNAPSHOT"
  :plugins [
  [lein-kotlin "0.0.2"]
  [lein-auto "0.1.3"]
  ]
  :prep-tasks ["kotlin"]
  :main "kotlin2"
  :auto {:default {:file-pattern #"\.(kt)$"}}
  
  :profiles {:dev {:dependencies [[org.jetbrains.kotlin/kotlin-runtime "1.1.4-3"]]}}
  :kotlin-source-path "src"
  :kotlin-java-version "1.8"
  :dependencies [
   [org.clojure/clojure "1.8.0"]
   [no.tornado/tornadofx "1.7.11"]
  ])