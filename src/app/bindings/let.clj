(ns app.bindings.let)
;; To bind values to names, use let. Let takes a vector which takes a symbol in the first element and a value in the second element.

(let [y "Yoda"]
  (println (str "Do. Or do not. There is no try - " y)))

;; You cannot resolve the symbol outside the let
(println y)

(let [a "afraid"
      b "brave"
      bran "Bran"
      ed "Eddard Stark"
      author (str bran " & " ed)]
  (println (str "\"Can a man still be " b " if he's " a "?"\"))
  (println (str "\"That is the only time a man can be " b"."\"))
  (println (str author)))
