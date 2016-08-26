(ns app.functions.multi_arity_variadic_fn)

(defn greet
  ([] (greet "Lucas"))
  ([name] (println "Hello " name)))

(greet)
;> Hello Lucas
(greet "Sharon")
;> Hello Sharon

; Rest Arguments
(defn greet_many
  [first & rest] (println first rest))

(greet_many "Billy" "Peppy" "Joana" "Fred")
;>lucas (arroz Joana Fred)

; Apply unpacks a sequence and pass unpacked values to a function as individual arguments
(defn greet_many_apply
  [first & rest] (apply println first rest))
(greet_many_apply "Billy" "Peppy" "Joana" "Fred")
