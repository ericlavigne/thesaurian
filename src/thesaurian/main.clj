(ns thesaurian.main
  (:use compojure.core
	ring.adapter.jetty)
  (:require [compojure.route :as route]
	    [thesaurian.view :as view]))

(defroutes main-routes
  (route/files "/" {:root "static"})
  (GET "/" [] (view/index))
  (route/not-found "That page does not exist."))

(defn main [& args]
  (let [port (if (empty? args)
	       8080
	       (Integer/parseInt (first args)))]
    (run-jetty main-routes {:port port})))
