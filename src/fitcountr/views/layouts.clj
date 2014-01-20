(ns fitcountr.views.layouts
  (:use [hiccup.core :only (html)]
        [hiccup.page :only (html5 include-css)]))

(defn application [title & body]
  (html5
    [:head
      [:meta {:charset "utf-8"}]
      [:meta {:http-equiv "X-UA-Compatible" :content "IE=edge,chrome=1"}]
      [:meta {:name "viewport" :content "width=device-width, initial-scale=1, maximum-scale=1"}]
      [:title title]]
    [:body body]))
