(ns clojure-todo.core
  (:gen-class)
  (:require [compojure.core :refer [defroutes]]
            [compojure.route :as route]
            [ring.util.response :refer [file-response]]))

(defroutes app
  (route/files "/" {:root "public" :index-files ["index.html"]})
  (route/not-found (file-response "public/404.html")))