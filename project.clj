(defproject org.clojars.pablobcb/ring-correlation-id "0.4.3"
  :description "Correlation ID tracing for distributed systems using ring and clj-http"
  :url "https://github.com/ejschoen/ring-correlation-id.git"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies []
  :profiles {:dev {:dependencies [[org.clojure/clojure "1.10.1"]
                                  [ring "1.6.3"]
                                  [com.taoensso/timbre "4.10.0"]
                                  [clj-http "3.7.0"]
                                  [clj-http-fake "1.0.3"]]}}
  )
