(ns test-first-clj.02-my-reverse-test
  (:require [clojure.test :refer :all]
            [test-first-clj.02-my-reverse :refer :all]))

(deftest my-reverse-test
  (is (= (my-reverse [1 2 3 4 5]) [5 4 3 2 1])
      "reverse a flat vector")
  (is (= (my-reverse '(1 2 3 4 5)) '(5 4 3 2 1))
      "reverse a flat list")
  (is (= (my-reverse [[1 2][3 4][5 6]]) [[5 6][3 4][1 2]])
      "reverse nested vectors, but not their contents"))
