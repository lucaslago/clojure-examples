(ns app.main
  (require [app.helloworld.example :refer [hello-world]]))

(defn -main
  []
  (hello-world))
