(ns leiningen.kotlin
  (:require [leiningen.core.eval :refer [eval-in-project]]
            [leiningen.core.project :refer [merge-profiles]]))

(defn kotlin
  "I don't do a lot."
  [project & args]
  (let [ksrc (:kotlin-source-path project)
        target (or (:compile-path project) "target")
        jvmTarget (or (:kotlin-java-version project) "1.8")
        version (or (:kotlin-compiler-version project) "1.1.51")
        p (merge-profiles project [{:dependencies [['org.jetbrains.kotlin/kotlin-compiler version]]}])
        p (dissoc p :prep-tasks)]
    (when ksrc
      (eval-in-project
        p
        `(do
           (org.jetbrains.kotlin.cli.jvm.K2JVMCompiler/main
             ; (into-array ["-jvmTarget" jvmTarget "-cp" (System/getProperty "java.class.path") "-d" ~target ~ksrc])))))))
             (into-array ["-Xskip-runtime-version-check" "-no-stdlib" "-Xskip-runtime-version-check" "-cp" (System/getProperty "java.class.path") "-jvm-target" "1.8" "-d" ~target ~ksrc])))))))
