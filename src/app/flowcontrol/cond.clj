(ns app.flowcontrol.cond)

; Same flow as case but you can build your test case
(defn disney-height-requirement
  "Takes the height in meters"
  [height]
  (cond
    (and (>= height 1) (<= height 2.5)) "You can join our attraction!"
    :else "You are either too tall or too short!"))

(disney-height-requirement 1.75)
; "You can join our attraction!"

(disney-height-requirement 0.8)
; "You are either too tall or too short!")

(disney-height-requirement 2.6)
; "You are either too tall or too short!")
