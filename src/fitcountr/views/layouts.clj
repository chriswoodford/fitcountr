(ns fitcountr.views.layouts
  (:use [hiccup.core :only (html)]
        [hiccup.page :only (html5 include-css include-js)]))

(defn hbs [body template-name]
  [:script
    (into {}
      (filter
        (comp not nil? val)
        {:type "text/x-handlebars" :data-template-name template-name}))
    body])

(defn layout [title & body]
  (html5
    [:head
      [:meta {:charset "utf-8"}]
      [:meta {:http-equiv "X-UA-Compatible" :content "IE=edge"}]
      [:meta {:name "viewport" :content "width=device-width, initial-scale=1.0"}]
      [:meta {:description ""}]
      [:meta {:author "Chris Woodford @chriswoodford"}]
      (include-css "/css/bootstrap.min.css"
                  "/css/bootstrap-theme.min.css")
      (include-js "/js/jquery.min.js"
                  "/js/bootstrap.min.js"
                  "/js/handlebars.js"
                  "/js/ember.js"
                  "/js/app.js")
      [:title title]]
    [:body body]))

(defn application [title template]
  (layout
    title
    template
    (hbs "{{outlet}}" nil)))
