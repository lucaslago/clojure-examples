(ns app.functions.defn)
; defn is used to bind a value to a symbol

(defn say-hello
  "Takes a name as argument and says hello to that name"
  [name]
  println (str "Hello, " name "!"))

(say-hello "Luke")
; To read documentation (doc say-hello) 

; Getting a function's  meta data
(meta (var say-hello))

