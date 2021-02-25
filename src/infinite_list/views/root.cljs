(ns infinite-list.views.root
  (:require
   [re-frame.core :as re-frame]
   [infinite-list.mui :as mui]
   [infinite-list.views.util :as views.util]
   [infinite-list.util :as util]))

(defn title []
  (let [greeting @(re-frame/subscribe [:greeting])]
    [mui/typography
     {:variant :h2
      :align :center}
     greeting]))

(defn component []
  [mui/container
   {:max-width "xl"}
   [title]
   [views.util/app-db-viewer]
   [views.util/footer]])
