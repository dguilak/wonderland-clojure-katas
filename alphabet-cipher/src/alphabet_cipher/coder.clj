(ns alphabet-cipher.coder)

(defn alpha-range [begin end]
  "Gives all characters between `begin' and `end'"
  (map char (range (int begin) (inc (int end)))))

(defn substitution-chart [x-char y-char]
  "Gives the substitution chart for a particular letter-letter combination"
  (nth (cycle (alpha-range \a \z)) (+ (- (int y-char) 97) (- (int x-char) 97))))

(defn encode [keyword message]
  "Encodes `keyword' with `message' using the alphabet cipher"
  (apply str (map substitution-chart (cycle (seq keyword)) message)))

(defn decode [keyword message]
  "decodeme")

(defn decipher [cipher message]
  "decypherme")

