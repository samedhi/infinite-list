(ns infinite-list.core-test
  (:require
   [cljs.test :as t :include-macros true]
   [infinite-list.core :as sut]))

(t/deftest test-example
  (t/is (= 1 (int "1")))
  (t/are [x y] (= x y)
    2 (+ 1 1)
    4 (* 2 2)))

