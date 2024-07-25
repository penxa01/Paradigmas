-- Calcular el producto de una matriz por un vector.
--zipWith (*) fila vector

producto :: Num a => [[a]] -> [a] -> [a]
producto matriz vector = [sum (zipWith (*) fila vector)  | fila <- matriz] 

productoVectores :: Integral a => [a] -> [a] -> a
productoVectores [] [] = 0
productoVectores (x:xs) (z:zs) = x*z + productoVectores xs zs 

productoRecursivo :: Integral a => [[a]] -> [a] -> [a]
productoRecursivo [] a = []
productoRecursivo (x:xs) vector = productoVectores x vector ++ productoRecursivo xs vector

--Ejercicio Nº 13: Calcular la suma de dos matrices.
sumaVectores :: (Integral a) => [a] -> [a] -> [a]
sumaVectores [] [] = []
sumaVectores a [] = a
sumaVectores [] a = a
sumaVectores (x:xs) (y:ys) = (x+y) : sumaVectores xs ys 

-- consulta sumaMatrices[[1,1,1],[1,1,1],[1,1,1]] [[0,0,0],[1,1,1],[2,2,2],[3,3,3]]
sumaMatrices:: (Integral a) => [[a]] -> [[a]] -> [[a]]
sumaMatrices [] [] = []
sumaMatrices a [] = a
sumaMatrices (x:xs) (y:ys) = sumaVectores x y : sumaMatrices xs ys