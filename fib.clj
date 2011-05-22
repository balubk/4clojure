(defn fib [x]
  (loop [lst '(1 1)
         cnt 2
         a 1
         b 1]
    (if (= cnt x)
      lst
      (recur (conj lst (+ a b))
             (inc cnt)
             b
             (+ a b)))))
