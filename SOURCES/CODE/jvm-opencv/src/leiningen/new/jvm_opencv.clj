(ns leiningen.new.jvm-opencv
  (:use [leiningen.new.templates :only [renderer name-to-path sanitize-ns ->files]]))

(def render (renderer "jvm-opencv"))

(defn jvm-opencv
  [name]
  (let [data {:name name
              :ns-name (sanitize-ns name)
              :sanitized (name-to-path name)}]
    (->files data 
    	; ["src/{{sanitized}}/core.clj" (render "src/leinin/core.clj" data)]
		; ["test/{{sanitized}}/core_test.clj" (render "test/leinin/core_test.clj" data)]
["project.clj" (render "project.clj" data)]
["java/HelloCv.java" (render "java/HelloCv.java")]
)))