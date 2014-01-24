(ns fitcountr.views.static
  (:use [hiccup.core :only (h html)])
  (:require [fitcountr.views.layouts :as layouts]))

(defn home []
  (layouts/application
    "fitcountr"
    (layouts/hbs
      (html
        [:div {:class "jumbotron"}
          [:div {:class "container"}]])
      "home")))
