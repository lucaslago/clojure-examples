(ns app.flowcontrol.when)
; When you only care about the case when the condition is truthy
(when true
  (println "i see")
  (println "a little silhouetto of a man,")
  (println "scaramouche, scaramouche, will you do the fandango?"))

(when false
  (println "Nope.")
  (println "This won't show up."))

(when-let [positive-numbers (filter pos? [-1 -2 1 2 3])]
  (print positive-numbers)
  (println " are my favorite numbers"))
