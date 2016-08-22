(ns app.flowcontrol.case)

(defn ones-and-twos
  [n]
  (case n
    1 "It's one!!!"
    2 "It's twoooo!!"
    "It's something else"))

(ones-and-twos 1)
; It's one!!!
(ones-and-twos 2)
; It's twoooo!!
(ones-and-twos 3)
; It's something else

