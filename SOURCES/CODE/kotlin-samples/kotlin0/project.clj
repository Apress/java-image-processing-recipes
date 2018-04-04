(defproject kotlin0 "0.1.0-SNAPSHOT"
  :plugins [
  [lein-kotlin "0.0.2"]
  ]
  :profiles {:dev {:dependencies [[org.jetbrains.kotlin/kotlin-runtime "1.1.4-3"]]}}
  :kotlin-source-path "src"
  :kotlin-java-version "1.8"
  :dependencies [
   [org.clojure/clojure "1.8.0"]
  ])