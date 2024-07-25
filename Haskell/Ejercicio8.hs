--Definir una función recursiva que permita eliminar los elementos repetidos de una lista de átomos.
repetidos::(Integral a) => [a] -> [a]
repetidos [] = []
repetidos (x:xs) = x:repetidos (filter (/=x) xs)