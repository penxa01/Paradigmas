%contar(7,[3,6,7,3,9,7,1,7],X).

contar(_,[],C):- C is 0.
contar(X,[X|Y],C):-contar(X,Y,A),C is A+1.
contar(X,[_|Y],C):-contar(X,Y,C).
