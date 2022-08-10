(ns dcss-webtiles-server.env
  (:require
    [selmer.parser :as parser]
    [clojure.tools.logging :as log]
    [dcss-webtiles-server.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[dcss-webtiles-server started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[dcss-webtiles-server has shut down successfully]=-"))
   :middleware wrap-dev})
