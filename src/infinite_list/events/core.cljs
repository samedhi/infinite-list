(ns infinite-list.events.core
  (:require
   [re-frame.core :as re-frame]
   [infinite-list.config :as config]))

(re-frame/reg-event-db
 :initialize-db
 (fn [_ _]
   config/default-db))
