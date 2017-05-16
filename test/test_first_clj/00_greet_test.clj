(ns test-first-clj.00-greet-test
  (:require  [clojure.test :refer :all]
             [test-first-clj.00-greet :refer :all]))

(deftest greet-anon
  (testing "says hello"
    (is (= (greet) "Hello!"))))

(deftest greet-someone
  (testing "says hello to an individual"
    (is (= (greet "Alice") "Hello, Alice!"))
    (is (= (greet "Bob") "Hello, Bob!"))))
