(defproject thesaurian "0.1" 
  :description "Web application for creating controlled vocabularies." 
  :main thesaurian.main
  :dependencies [[org.clojure/clojure "1.1.0"] 
		 [org.clojure/clojure-contrib "1.1.0"]
		 [compojure "0.4.0"]
		 [ring/ring-jetty-adapter "0.2.3"]
		 [hiccup "0.2.6"]]
  :dev-dependencies [[leiningen-run "0.3"]])
