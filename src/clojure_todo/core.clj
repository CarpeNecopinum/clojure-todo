(ns clojure-todo.core
  (:gen-class)
  (:require [compojure.core :refer [defroutes, GET]]
            [compojure.route :as route]))

(defroutes app
  (GET "/:name" [name] (str "<h1>Hello, " name "!</h1>"))
  (GET "/" [] "<h1>Hello Clojure</h1>")
  (route/not-found "<h1>Page not found</h1>"))