(ns fitcountr.views.layouts
  (:use [hiccup.core :only (html)]
        [hiccup.page :only (html5 include-css include-js)]))

(defn application [title & body]
  (html5
    [:head
      [:meta {:charset "utf-8"}]
      [:meta {:http-equiv "X-UA-Compatible" :content "IE=edge"}]
      [:meta {:name "viewport" :content "width=width=device-width, initial-scale=1.0"}]
      [:meta {:description ""}]
      [:meta {:author "Chris Woodford @chriswoodford"}]
      (include-css "/css/bootstrap.min.css"
                  "/css/bootstrap.theme.css")
      (include-js "/js/bootstrap.min.js")
      [:title title]]
    [:body body]))
