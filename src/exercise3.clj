(ns exercise3)

(defn fibonacci
  "Returns the n term of the Fibonacci sequence"
  [n]
  (if (zero? n)
    0
    (if (= n 1)
      1
      (+(fibonacci (- n 1))(fibonacci (- n 2)))
    )
  )
  )