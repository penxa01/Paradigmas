miembro(X,[X|_]).
miembro(Y,[_|L1]):- miembro(Y,L1).
