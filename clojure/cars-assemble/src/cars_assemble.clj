(ns cars-assemble)

(def cars-per-hour 221)

(defn production-rate
      "Returns the assembly line's production rate per hour,
       taking into account its success rate"
      [speed]
      (cond (= speed 0) (double 0)
            (and (>= speed 1) (<= speed 4)) (double (* speed cars-per-hour))
            (and (>= speed 5) (<= speed 8)) (double (* 0.9 speed cars-per-hour))
            (= speed 9) (double (* 0.8 speed cars-per-hour))
            (= speed 10) (double (* 0.77 speed cars-per-hour))
            )
      )

(defn working-items
      "Calculates how many working cars are produced per minute"
      [speed]
      (int (/ (production-rate speed) 60))
      )
