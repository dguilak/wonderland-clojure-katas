(ns alphabet-cipher.coder)

(defn abs [n]
  (max n (- n)))

(defn alpha-range [begin end]
  "Gives all characters between `begin' and `end'"
  (map char (range (int begin) (inc (int end)))))

(defn substitution-chart [x-char y-char]
  "Gives the substitution chart for a particular letter-letter combination"
  (nth (cycle (alpha-range \a \z)) (+ (- (int y-char) 97) (- (int x-char) 97))))

(defn lookup-by-value-and-key [key encoded]
  (char (+ 97 (count (take-while #(not= % encoded) (drop-while #(not= % key) (cycle (alpha-range \a \z))))))))

(defn encode [keyword message]
  "Encodes `keyword' with `message' using the alphabet cipher"
  (apply str (map substitution-chart (cycle (seq keyword)) message)))

(defn decode [keyword message]
  (apply str (map lookup-by-value-and-key (cycle (seq keyword)) message)))

(defn decipher [cipher message]
  "decypherme")
