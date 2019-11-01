(defproject awb99.fortune "0.0.1"
  :description "Fortune Cookie Wisdom"
  :url "https://github.com/awb99/fortune"
  :license {:name "MIT License"
            :url "http://opensource.org/licenses/MIT"}

  ;:deploy-repositories [["releases" :clojars]]
  :repositories [["clojars" {:url "https://clojars.org/repo"
                             :username "awb99"
                             :sign-releases false}]]

  :dependencies
  [[org.clojure/clojure "1.9.0"]]
  :profiles {})
