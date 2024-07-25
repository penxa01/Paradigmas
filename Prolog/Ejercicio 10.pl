reves([],[]).
reves([X|L1],Y):-append(A,[X],Y),reves(L1,A).
