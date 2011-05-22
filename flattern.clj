(defn my-flatten [x]
  (loop [flst '[] lst x]
    (cond
     (= '() lst) flst
     (coll? (first lst)) (recur flst (concat (my-flatten (first lst)) (rest lst)))
     :else (recur (conj flst (first lst)) (rest lst))
     )))

(my-flatten '(1 2 3))
(my-flatten '(1 (2 3) 4))
(my-flatten '((1 2) 3 [4 [5 6]]))
