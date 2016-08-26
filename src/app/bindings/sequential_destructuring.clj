; Destructuring is a way to concisely bind names to the values inside a data structure.
(ns app.bindings.sequential_destructuring)

(def my-vector [1 2 3])
(def my-list '(1 2 3))
(def my-string "abc")

(let [[x y z] my-vector]
  (println x y z))
;= 1 2 3

;= We can also use a similar technique to destructure a list
(let [[x y z] my-list]
  (println x y z))
;= 1 2 3

;= For strings, the elements are destructured by character.
(let [[x y z] my-string]
  (println x y z)
  (map type [x y z]))
;= a b c
;= (java.lang.Character java.lang.Character java.lang.Character)
