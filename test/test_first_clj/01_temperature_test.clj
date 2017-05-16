(ns test-first-clj.01-temperature-test
  (:require  [clojure.test :refer :all]
             [test-first-clj.01-temperature :refer :all]))

(deftest convert-farenheit-to-celsius
  (testing "converts freezing temperature"
    (is (= (f->c 32) 0)))
  (testing "converts body temperature"
    (is (= (f->c 98.6) 37)))
  (testing "converts boiling temperature"
    (is (= (f->c 212) 100)))
  (testing "converts an arbitrary temperature"
    (is (= (f->c 68) 20))))

(deftest convert-celsius-to-farenheit
  (testing "converts freezing temperature"
    (is (= (c->f 0) 32)))
  (testing "converts body temperature to a float"
    (is (= (c->f 37) 98.6)))
  (testing "converts boiling temperature"
    (is (= (c->f 100) 212)))
  (testing "converts an arbitrary temperature"
    (is (= (c->f 20) 68))))
