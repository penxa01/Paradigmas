afiliados([juan,mario,ana,hugo,auri,bta]).

grupoFamiliar(juan,[ahag]).
grupoFamiliar(hugo,[jdjdb]).
grupoFamiliar(mario,[]).
grupoFamiliar(ana,[jdjd]).
grupoFamiliar(auri,[]).
grupoFamiliar(bta,[]).

listado(Z):-afiliados(X),buscar(X,Z).

buscar([],[]):-!.
buscar([X|C],[X|Y]):-grupoFamiliar(X,[]),buscar(C,Y),!.
buscar([_|C],Y):-buscar(C,Y).





%*consulta Listado(X). X = [Mario]
