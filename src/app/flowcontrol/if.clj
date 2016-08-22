(ns app.flowcontrol.if)

(if true
  (println "Heyaaa")
  (println "Not showing up"))
; Heyaaa


(if true
  (do
    (print "Hey! ")
    (println "Hold your horses!")))
; Hey! Hold your horses!

; After testing condition, you often want to reuse it later. if-let binds the evaluated condition to var when it’s truthy.
(defn get-positive-numbers [numbers]
  (if-let [positive-numbers (seq (filter pos? numbers))]
    positive-numbers
    "no positive numbers"))

(get-positive-numbers [-1 -2 1 2])
; (1, 2)

(get-positive-numbers [-1 -2 -3])
; no positive numbers
