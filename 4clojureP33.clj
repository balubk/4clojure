(defn rep-seq
  "Replicate each element of a sequence a variable number of times"
  [y n]
  (apply concat (map
                 (fn [x]
                   (loop [i 0 flst '()]
                     (if (< i n)
                       (recur (inc i) (conj flst x))
                       flst))
                   )
                 y)))

(rep-seq [1 2 3] 2)
(= (rep-seq [1 2 3] 2) '(1 1 2 2 3 3))
