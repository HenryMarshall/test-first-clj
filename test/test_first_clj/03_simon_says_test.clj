(ns test-first-clj.03-simon-says-test
  (:require  [clojure.test :refer :all]
             [test-first-clj.03-simon-says :refer :all]))

(deftest simon-says-test
  (testing "should echo your message"
    (is (= (echo "hello") "hello")
        "composed of lowercase letters")
    (is (= (echo "Goodbye 4 now!") "Goodbye 4 now!")
        "with mixed case, numbers, and special characters"))

  (testing "should SHOUT your message"
    (is (= (shout "something important") "SOMETHING IMPORTANT"))))
