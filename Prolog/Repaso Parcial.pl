% Hechos
categoria(infantil, 5, 12).
categoria(juvenil, 13, 20).
categoria(mayor, 21, 45).




genera(Lista,[[infantiles,A],[juveniles,B],[mayores|C]]):-contar(Lista,A,B,C).

contar([],0,0,0).
contar([[_,Y]|Z],A,B,C):-
    categoria(infantil,W,T),
    Y>=W,Y=<T,
    contar(Z,D,B,C),
    A is D+1,!.

contar([[_,Y]|Z],A,B,C):-
    categoria(juvenil,W,T),
    Y>=W,Y=<T,
    contar(Z,A,D,C),
    B is D+1,!.

contar([[_,Y]|Z],A,B,C):-
    categoria(mayor,W,T),
    Y>=W,Y=<T,
    C is D+1,
    contar(Z,A,B,D),C is D+1,!.

% Generar un predicado que reciba una lista de tuplas del nombre de una persona con su edad, y devuelva una lista como la expuesta contabilizando las personas segun su categoria de edad
