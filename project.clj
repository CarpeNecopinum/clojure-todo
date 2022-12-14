(defproject clojure-todo "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "https://github.com/CarpeNecopinum/clojure-todo"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.11.1"]
                 [ring "1.9.6"]
                 [compojure "1.7.0"]]
  :plugins [[lein-ring "0.12.6"]]
  :main ^:skip-aot clojure-todo.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}}
  :ring {:handler clojure-todo.core/app})
