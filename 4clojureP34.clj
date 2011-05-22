(defn range2 [begin end]
  (loop [i begin
         lst '()]
    (if (= i end)
      (reverse lst)
      (recur (inc i) (conj lst i)))))

(= (range2 1 4) '(1 2 3))
(= (range2 -2 2) '(-2 -1 0 1))
(= (range2 5 8) '(5 6 7))
