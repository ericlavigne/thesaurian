(ns thesaurian.view
  (:use hiccup.core
	hiccup.page-helpers))

(defn layout [title & body]
  (html
   (doctype :xhtml-strict)
   (xhtml-tag "en"
	      [:head 
	       [:meta {:http-equiv "Content-type"
		       :content "text/html; charset=utf-8"}]
	       [:title title]]
	      [:body body])))

(defn index []
  (layout "Thesaurian"
	  [:img {:src "/thesaurian.png" :alt "Thesaurian"}]
          [:br] [:br]
          [:p "This project is in early development. See the source code on "
           (link-to "http://github.com/ericlavigne/thesaurian" "Github.")]))
