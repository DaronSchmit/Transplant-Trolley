;;Generates a population of people
;;Gives statistics on how many need an organ and how many do not


;;Retrieves the health status of a person. Gets True/False value associated with needing an organ
(defn count-healthy [population] (
	if (= 0 (count population)) 
		0 
		(if (= true (second(first population))) (inc (count-healthy (rest population))) (count-healthy (rest population)))
		)
)

;;Generates a person with a chance "p" of needing an organ.
;;Each person is a vector with a True or False value associated with needing an organ.
(defn gen-person [] 
	(let [x (rand-int 4)] 
		(if (= 0 x) 
			(vector "Needs Organ" true)
			(vector "Needs Organ" false)
		)
	)
)

;;Generates a population of "n" people which are maps in a vector. See: gen_person
(defn gen-population[n] 
	(if (= 0 n) 
		(vector)
		(conj (gen-population (dec n)) (gen-person))
	)
)

(defn run [pop-size] (println "Number of Healthy People this round: " (count-healthy (gen-population pop-size))))

