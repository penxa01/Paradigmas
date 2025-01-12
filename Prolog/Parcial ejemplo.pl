encargado_de(miguel,[admision,control,vigilancia]).
encargado_de(ricardo,[planificacion,asesoramiento]).
encargado_de(alicia,[direccion,control]).

miembro(X,[X|_]).
miembro(X,[_|Y]):-miembro(X,Y).

buscar(X,Y,Z):-
    miembro(Z,X),
    miembro(Z,Y).

comparten_tarea(X,Y):-
    encargado_de(X,Z),
    encargado_de(Y,W),
    buscar(Z,W,_).

