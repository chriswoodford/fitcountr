(ns fitcountr.core
  (:use [compojure.core :only (defroutes GET)]
        [ring.adapter.jetty :as ring])
  (:require [compojure.route :as route]
            [compojure.handler :as handler]
            [fitcountr.views.static :as static])
  (:gen-class))

(defroutes routes
  (GET "/" [] (static/home))
  (route/resources "/"))

(def application (handler/site routes))

(defn start [port]
  (run-jetty application {:port port
                          :join? false}))

(defn -main []
  (start 5000))
