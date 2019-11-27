(ns fortune.core
  (:require
   [fortune.db :refer [db]]))


(defn cookie
  ([index]
   (nth db index))
  ([]
   (let [size (count db)
         index (rand-int size)] 
     (cookie index))))


(comment

  (cookie)
  
  (cookie 5)
  )




