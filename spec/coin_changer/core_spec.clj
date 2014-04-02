(ns coin_changer.core-spec
  (:require [speclj.core :refer :all]))

(defn make_change [amount]
 (let [nickels (int (/ amount 5)) 
      pennies (rem amount 5)]
     (concat
       (take nickels (repeat 5))
       (take pennies (repeat 1)))))

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
  
  (it "makes change for 9 cents"
    (should= [5 1 1 1 1] (make_change 9)))

  (it "makes change for 10 cents"
    (should= [10] (make_change 10)))
)
(run-specs)
