(ns fitcountr.views.static
  (:use [hiccup.core :only (h)])
  (:require [fitcountr.views.layouts :as layouts]))

(defn home []
  (layouts/application
    "fitcountr"
    (layouts/hbs
      "MAMA. MAMA I'M COMIN' HOOOOOME"
      "home")))
