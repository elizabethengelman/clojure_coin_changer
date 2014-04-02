(defproject coin_changer "0.1.0-SNAPSHOT"
  :description "makes change"
  :dependencies [[org.clojure/clojure "1.5.1"]]
  :profiles {:dev {:dependencies [[speclj "3.0.1"]]}}
  :plugins [[speclj "3.0.1"]]
  :test-paths ["spec"]
  :main coin_changer.core)
