(ns app.functions.anonymous_fn)

; To create anonymous functions use fn
((fn [] (println "Hello, baby!")))

; Binding an anonymous function to var. This works just like defn
(def hello-baby-func (fn [] (println "Hello, baby 2!")))
(hello-baby-func)

; #() is the shortcut for fn.
(#(+ 1 1 ))

; % will be replaced with arguments passed to the function
#(+ 1 %)

(let [plus_one #(+ 1 %)]
  (plus_one 10))
; 11

; When more than one argument is passed add the corresponding number to %
(let [sum_three_numbers #(+ %1 %2 %3)]
  (sum_three_numbers 10 10 30))
; 50

; Passing functions to other functions
(def say-hi (fn [name] (println (str "Hi, " name))))
(def say-bye (fn [name] (println (str "Goodbye, " name))))
(def greet (fn [greeting-func name] (greeting-func name)))

(greet say-hi "Lucas")
(greet say-bye "Lucas")
