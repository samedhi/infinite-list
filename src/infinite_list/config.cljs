(ns infinite-list.config)

(def breakpoints
  {:breakpoints [:mobile        768
                 :tablet        992
                 :small-monitor 1200
                 :large-monitor     ]
   :debounce-ms 166})

(def default-db {:greeting "Welcome to the infinite-list app!"})
