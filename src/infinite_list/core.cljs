(ns ^:figwheel-hooks infinite-list.core
  (:require
   [firemore.core :as firemore]
   [goog.dom :as goog.dom]
   [reagent.dom :as reagent.dom]
   [re-frame.core :as re-frame]
   [infinite-list.breakpoints :as breakpoints]
   [infinite-list.events.core :as events]
   [infinite-list.subs.core :as subs]
   [infinite-list.views.root :as root]))

(enable-console-print!)

(defn mount-root []
  (when-let [el (goog.dom/getElement "app")]
    (reagent.dom/render root/component el)))

(defn ^:after-load init []
  (re-frame/clear-subscription-cache!)
  (breakpoints/init)
  (mount-root)
  :success)

(defonce run-at-app-startup
  (do
    (re-frame/dispatch-sync [:initialize-db])
    (init)))
