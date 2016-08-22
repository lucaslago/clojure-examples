(ns app.bindings.scope)

; Each let will create a scope and symbol resolution is done inside the let where the symbol is resolved.
(let [switcheroo "Farewell!"]
  (let [switcheroo "Why, hello there."]
    (println switcheroo))
  (println switcheroo))

; The resolution bubbles up the scopes until finding the binding.
(let [b "Bubbles! Bubbles! My bubbles."]
  (let []
    (println b)))
