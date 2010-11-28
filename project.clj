(defproject thesaurian "0.1" 
  :description "Web application for creating controlled vocabularies." 
  :dependencies [[org.clojure/clojure "1.2.0"] 
		 [org.clojure/clojure-contrib "1.2.0"]
		 [compojure "0.5.3"]
		 [ring/ring-jetty-adapter "0.3.4"]
		 [hiccup "0.3.1"]
		 [scriptjure "0.1.20"]
             ]
  :dev-dependencies [[lein-clojars "0.6.0"]
                     [lein-run "1.0.1-SNAPSHOT"]])

; Note: the project.clj file for FleetDB server is instructive
; with respect to Leiningen options and available libraries.
; http://github.com/mmcgrana/fleetdb/blob/master/project.clj

