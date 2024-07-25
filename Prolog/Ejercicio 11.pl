elim(_,[],[]).
elim(X,[X|L1],L2):- elim(X,L1,L2).
elim(X,[Y|L1],[Y|L2]):- elim(X,L1,L2).
