(ns coin_changer.core-spec
  (:require [speclj.core :refer :all]))

(defn make_change [n]
  n)

(describe "make_change"
  (it "makes change for 1 cent"
    (should= 1 (make_change 1)))

  (it "makes change for 2 cents"
    (should= 2 (make_change 2)))
  
  (it "makes change for 3 cents"
    (should= 3 (make_change 3))))
(run-specs)
