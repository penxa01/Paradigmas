--Definir la funcion modulo con restas sucesivas

modulo ::(Integral a)=> a -> a -> a
modulo a b
    | a == 0 = 0
    | a< b = a
    |otherwise = modulo (a-b) b
