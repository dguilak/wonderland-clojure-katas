(ns wonderland-number.finder)

(defn is-magic-number? [n]
  (apply = (map (comp set str (partial * n)) (range 2 7))))

(defn wonderland-number []
  (first (filter is-magic-number? (range 100000 999999)))
