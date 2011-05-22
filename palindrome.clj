(defn foo [x]
  (let [lst2 (reverse x)]
    (loop [lst x
           lst3 lst2]
      (if (= lst '())
        true
        (if (not (= (first lst) (first lst3)))
          false
          (recur (rest lst) (rest lst3)))))))
