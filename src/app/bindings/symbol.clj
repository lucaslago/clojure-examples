(ns app.bindings.symbol)
;; Used to bind names and values together
;; Tip: ' prevents a form from being evaluated

(type 'a)
;; clojure.lang.Symbol
(type 'awesome-function)
;; clojure.lang.Symbol
(type oopsies)
;; RuntimeException: Cannot resolve symbol

