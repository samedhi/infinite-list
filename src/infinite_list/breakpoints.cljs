(ns infinite-list.breakpoints
  (:require
   [breaking-point.core :as bp]
   [re-frame.core :as re-frame]
   [infinite-list.config :as config]))

(def previous-breakpoints (atom nil))

(defn init []
  (when (not= @previous-breakpoints config/breakpoints)
    (reset! previous-breakpoints config/breakpoints)
    (re-frame/dispatch-sync [::bp/set-breakpoints config/breakpoints])))


