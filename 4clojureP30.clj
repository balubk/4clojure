(defn rm-cons [x]
  (loop [prev '()
         lst x
         final []]
    (cond
     (= '() lst) final
     (= prev (first lst)) (recur prev (rest lst) final)
     :else (recur (first lst) (rest lst) (conj final (first lst))))))

(apply str (rm-cons "Leeeeeerrroyyy"))
(rm-cons [1 1 2 3 3 2 2 3])
(rm-cons [[1 2] [1 2] [3 4] [1 2]])
