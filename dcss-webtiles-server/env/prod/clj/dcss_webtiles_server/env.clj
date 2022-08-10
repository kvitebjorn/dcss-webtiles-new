(ns dcss-webtiles-server.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[dcss-webtiles-server started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[dcss-webtiles-server has shut down successfully]=-"))
   :middleware identity})
