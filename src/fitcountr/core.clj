(ns fitcountr.core
  (:use [compojure.core :only (defroutes GET)]
        [ring.adapter.jetty :as ring])
  (:require [fitcountr.views.static :as static]))

(defroutes routes
  (GET "/" [] (static/home)))

(defn -main []
  (run-jetty #'routes {:port 5000 :join? false}))
