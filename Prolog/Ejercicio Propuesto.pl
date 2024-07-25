animales(mamifero([vaca,mono])).
animales(reptil([serpiente,coco])).
animales(pez([salmon])).

busca(X,[X|_]).
busca(X,[_|Y]):-busca(X,Y).

tipo(X,N):-animales(A),A =..[N,L],busca(X,L),!.

es(X):-tipo(X,A),write(A),nl.
es(X):-not(tipo(X,_)),write('ERROR').
