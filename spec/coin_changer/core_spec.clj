(ns coin_changer.core-spec
  (:require [speclj.core :refer :all]))

(defn make_change [amount]
 (if (>= amount 5) [5] 
    (take amount (repeat 1))) 
)

(describe "make_change"
  (it "makes change for 1 cent"
    (should= [1] (make_change 1)))

  (it "makes change for 2 cents"
    (should= [1 , 1] (make_change 2)))
  
  (it "makes change for 3 cents"
    (should= [1 1 1] (make_change 3)))
  
  (it "makes change for 4 cents" 
    (should= [1 1 1 1] (make_change 4)))

  (it "makes change for 5 cents"
    (should= [5] (make_change 5)))
  )
(run-specs)
