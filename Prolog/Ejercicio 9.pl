adyac(X,Y,[X,Y|L1]).
adyac(X,Y,[Y,X|L1]).
adyac(X,Y,[Z,W|L1]):-adyac(X,Y,[W|L1]).
