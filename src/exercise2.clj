(ns exercise2)

(defn only-greater-than-five
  "Filters items less than five in the list."
  [list]
  (filter (fn [x] (< 5 x)) list ))




