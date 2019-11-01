(ns fortune.core
  (:require 
   [fortune.db :refer [db]]))


(defn cookie []
  (let [size (count db)
        index (rand-int size)]
    (nth db index)))


(comment
  
  (cookie)
  
  )




