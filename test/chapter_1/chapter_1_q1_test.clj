(ns chapter-1.chapter-1-q1-test 
  (:require
   [chapter-1.chapter-1-q1 :refer [unique-chars unique-chars-v1]]
   [clojure.test :refer [deftest is]]))

(deftest unique-chars-test
  (doseq [elem [nil "" "a" "a" "ab" "abcdef" "ab" "bca"]]
    (is (unique-chars-v1 elem)))
  (doseq [elem ["aac" "aca" "aba" "abdcdef" "abcc" "bcaee"]]
    (is (not (unique-chars elem))))
  (doseq [elem ["" "a" "a" "ab" "abcdef" "ab" "bca"]]
    (is (unique-chars-v1 elem)))
  (doseq [elem ["aac" "aca" "aba" "abdcdef" "abcc" "bcaee"]]
    (is (not (unique-chars elem)))))

(comment
 (unique-chars-test))



