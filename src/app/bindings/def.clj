(ns app.bindings.def)
; Yon can bind symbol to values with def just like let, except you can access the symbol from everywhere.

; You can override a value binded to a symbol
(def replaceable "minion")
(println (str "A " replaceable " is replaceable"))

(def replaceable "Bob")
(println (str replaceable " is replaceable"))

; Avoid using def AS MUCH AS POSSIBLE, since it will introduce state
