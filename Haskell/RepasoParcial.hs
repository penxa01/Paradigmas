-- : Dada una lista ordenada y un átomo escribir una función que inserte el átomo en el lugar correspondiente
insertaOrdenado :: (Ord a) => a ->[a] ->[a]
insertaOrdenado x [] = [x]
insertaOrdenado x (y:ys)
    | x < y = x:y:ys
    | x > y = y:insertaOrdenado x ys
    |otherwise = x:ys


--consulta listaOrdenada [7,1,3,9,5] [4,5,8]
-- listaOrdenada [1,3,9,5] (insertaOrdenado 7 [4,5,8])
listaOrdenada :: (Ord a) => [a] ->[a] ->[a]
listaOrdenada [] [] = []
listaOrdenada [] a = a
-- listaOrdenada a [] = listaOrdenada (tail a) [head a]
listaOrdenada (x:xs) lista1 = listaOrdenada xs (insertaOrdenado x lista1) 


-- [[x,y]] [[y,z]] ->[[x,z]]
-- [[1,2],[5,6],[20,8]] [[6,100],[1,200],[3,300],[2,400],[8,500]]
enlace ::(Integral a)=> [[a]] -> [[a]] -> [[a]]
enlace lista1 lista2 = [head x:[last y| y <-lista2, last x == head y]| x<-lista1]
