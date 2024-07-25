--Implementar una función recursiva que pase un número decimal a binario
binario :: (Integral a) => a-> [a]
binario 0 = [0]
binario 1 = [1]
binario a = binario (div a 2) ++ [mod a 2]
