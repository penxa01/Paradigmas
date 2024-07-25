-- Ejercicio Nº 14: Defina una función que, aplicada a una lista de listas, permita obtener una lista de un solo nivel

listaUnica:: [[a]] -> [a]
listaUnica []  = []
listaUnica (x:xs) = x ++ (listaUnica xs)
