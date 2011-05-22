(defn pack-seq [x]
  (loop [prev (first x)
         lst x
         plst '()
         final []]
    (cond
     (= '() lst) (conj final plst) 
     (= prev (first lst)) (recur (first lst) (rest lst) (conj plst prev) final)
     :else (recur (first lst) (rest lst) (list (first lst)) (conj final plst))
     ))
  )

(pack-seq [1 1 2 1 1 1 3 3])
(= (pack-seq [1 1 2 1 1 1 3 3]) '((1 1) (2) (1 1 1) (3 3)))
(= (pack-seq [:a :a :b :b :c]) '((:a :a) (:b :b) (:c)))
(= (pack-seq [[1 2] [1 2] [3 4]]) '(([1 2] [1 2]) ([3 4])))
