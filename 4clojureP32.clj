(fn [y] (apply concat (map (fn [x] (list x x)) y)))
