(defn isUpper [x] (= x (.toUpperCase x)))
(defn isLower [x] (= x (.toLowerCase x)))
(defn isAlpha [x] (not (and (isUpper x) (isLower x))))
(defn keepUpper [x]
  (let [isUpper (fn [x] (= x (.toUpperCase x)))
        isLower (fn [x] (= x (.toLowerCase x)))
        isAlpha (fn [x] (not (and (isUpper x) (isLower x))))
        isAlphaAndUpper (fn [x] (and (isAlpha (str x)) (isUpper (str x))))]
    (apply str (filter isAlphaAndUpper x))))

(keepUpper "HeLlO, WoRlD!")
(keepUpper "nothing")
(keepUpper "$#A(*&987Zf")
