(ns app.functions.closure)

(defn popcorn-love-appender
  [text]
  (str text " And I also love popcorn!"))

(def result1 (popcorn-love-appender "Luke, I am your father!"))
(def result2 (popcorn-love-appender "These examples, lol."))
(println result1)
; Luke, I am your father!. And I also love popcorn!
(println result2)
; These examples, lol.. And I also love popcorn!
