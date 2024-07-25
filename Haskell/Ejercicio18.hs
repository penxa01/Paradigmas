-- Ejercicio Nº18: Escriba un programa que recibiendo como argumento una lista de listas donde cada sublista contiene nombre del docente, dedicación y carrera donde trabaja; entregue comoresultado una lista con los nombres de los docentes que cobrarán un plus considerando que loscobrarán aquellos docentes que tenga solamente un cargo con dedicación simple. 

-- plus [["Ana","Exclusivo","LSI"],["Mary","Semi","LCC"],["Jose","Simple","LSI"],["Mary","Simple","LSI"], ["Pepe","Simple","LSI"],…..] 

-- [<lo que vamos a mostrar>|x <- [<listaoriginal>],<condiciones > ]

--plus :: [[String,String,String]] -> [String]  

cantCargos :: String -> [[String]] -> Int
cantCargos nom lista = length [x| x <- lista, head x ==nom]

plus :: [[String]] -> [String]
plus x = [head a| a<- x, head(tail a) == "Simple" && cantCargos (head a) x == 1]

