(ns clojure-todo.core
  (:gen-class)
  (:require [compojure.core :refer [defroutes, GET]]
            [compojure.route :as route]))

(defroutes app
  (route/files "/" {:root "public" :index-files ["index.html"]})
  (route/not-found "<h1>Page not found</h1>"))