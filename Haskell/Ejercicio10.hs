-- Implementar una función recursiva que permita obtener la unión de dos listas dadas;los elementos repetidos solo deben aparecer una vez.
union ::(Eq a) => [a] -> [a] -> [a]
union [] b = b
union (x:xs) lista = x:union xs (filter (/=x) lista)
