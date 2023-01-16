(ns chapter-1.chapter-1-q1
  {:docstring
   "Is unique implement an algorithm to determine if a string has all unique characters.
    implement an algorithm without using any data structures?"})

(defn any-adjacencies? [sequence]
  (loop [last-char nil
         current (first sequence)
         remaining-str sequence]
    (if (empty? remaining-str)
      false
      (if (= current last-char)
        true
        (recur current
               (first (rest remaining-str))
               (rest remaining-str))))))

(defn unique-chars
  "Time complexity O(n)
  Sapce complecity O(n) "

  [s]
  (loop [seen {}
         current_char (first s)
         remaining s]
    (if (empty? remaining)
      true
      (if (not (nil? (get seen current_char)))
        false
        (recur (assoc seen current_char current_char)
               (first (rest remaining))
               (rest remaining))))))

(defn unique-chars-v1
  "Time complexity O(nlogn)
  Sapce complecity O(1) "
  [s]
  (if (or (nil? s) (empty? s))
    true
    (not (any-adjacencies? (sort s)))))
