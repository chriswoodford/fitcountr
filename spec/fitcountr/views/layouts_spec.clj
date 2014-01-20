(ns fitcountr.view.layouts-spec
  (:require [speclj.core :refer :all]
            [fitcountr.views.layouts :refer :all]))

(describe "hbs"
  (context "a name is included"
    (it "returns a list with 3 elements"
      (should= (count (hbs "content" "name")) 3))
    (it "has :script as the first element"
      (should= (first (hbs "content" "name")) :script))
    (it "has a hash-map with 2 keys as the second element"
      (let [m (get (hbs "content" "name") 1)]
        (should= (count m) 2)
        (should-contain :type m)
        (should-contain :data-template-name m)))
    (it "has the content as the last element"
      (should= (last (hbs "content" "name")) "content")))
  (context "a name is not included"
    (it "returns a list with 3 elements"
      (should= (count (hbs "content" nil)) 3))
    (it "has :script as the first element"
      (should= (first (hbs "content" nil)) :script))
    (it "has a hash-map with 1 key as the second element"
      (let [m (get (hbs "content" nil) 1)]
        (should= (count m) 1)
        (should-contain :type m)))
    (it "has the content as the last element"
      (should= (last (hbs "content" nil)) "content"))))
