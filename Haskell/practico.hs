-- Definir una función que cuente los elementos pares tiene una lista de números
cuentaPares ::(Integral a) => [a] ->Int
cuentaPares lista = length[x|x <- lista , even x] 

--  Definir una función que reciba una lista de listas y entregue la cantidad de elementosde la lista de mayor longitud.
listMayor :: [[a]] -> Int
listMayor list= maximum [ length x|x <- list]

--Definir una función que transforme una lista de números en otra lista que contenga el cubo de cada elemento
cuboElem :: (Integral a) => [a] -> [a]
cuboElem list = [x^3| x <- list]

