(ns wonderland-number.finder)

(defn is-magic-number? [n]
  (let [n2 (-> (* n 2) str set)
        n3 (-> (* n 3) str set)
        n4 (-> (* n 4) str set)
        n5 (-> (* n 5) str set)
        n6 (-> (* n 6) str set)]
    (= n2 n3 n4 n5 n6)))

(defn wonderland-number []
  (first (filter is-magic-number? (range 100000 999999))))
