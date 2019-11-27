(ns tictac.core
  "How deep will the rabbit hole go?"
  (:gen-class)
  (:require [clojure.pprint :refer [pprint]]
            [clojure.string :as string]))

(defn divide
  "Divides every character by 25"
  [input]
  (map #(-> %     ;; Single character
            int   ;; Character as number
            (/ 2) ;; Divide number
            int)  ;; Remove fraction
       input))

(defn sequence-of-events
  "Each function in the sequence of events can take one input and produce one output
   A -> B"
  [input]
  (-> input
      ;; Start
      divide

      ;; ^- Add more above.
      pprint))

(defonce ^:const message "The rabbits are running the rail yard.")

(defn -main
  [& args]
  (sequence-of-events message))

(comment
  ;; In the REPL just test by evaluating the following:
  (sequence-of-events message))
