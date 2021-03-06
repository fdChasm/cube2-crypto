(defproject sauerworld/cube2.crypto "0.8-SNAPSHOT"
  :description "clojure implementation of Cube 2: Sauerbraten authentication crypto library"
  :url "https://github.com/mgaare/cube2-crypto"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :profiles {:dev
             {:source-paths ["dev"]
              :dependencies [[org.clojars.jcrossley3/tools.namespace "0.2.4.1"]]}}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [crypto-random "1.1.0"]])
