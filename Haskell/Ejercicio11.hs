--Definir una función que permita contar los átomos de una lista de listas
atomos :: [[a]] -> Int
atomos [] = 0
atomos (x:xs) = length x + atomos xs