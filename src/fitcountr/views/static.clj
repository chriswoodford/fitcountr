(ns fitcountr.views.static
  (:use [hiccup.core :only (h)])
  (:require [fitcountr.views.layouts :as layouts]))

(defn home []
  (layouts/application "fitcountr" "<h2>Welcome Home</h2>"))
