medico(m1,rosales).
medico(m2,manni).
paciente(p1,juan).
paciente(p2,ana).
atiende(m1,p1).
atiende(m1,p2).
atiende(m2,p2).

opcion(1):-write('Ingrese nombre del MEDICO:'),
    read(A),nl,
    medico(X,A),
    atiende(X,Y),
    paciente(Y,Nombre),
    write(Nombre),nl,
    fail.
opcion(2):-write('Ingrese nombre de PACIENTE:'),
    read(A),nl,
    paciente(X,A),
    atiende(Y,X),
    medico(Y,Nombre),
    write(Nombre),nl,
    fail.
opcion(3):-write('ADIOS'),
    fail.
opcion(_):-base.

base:-write('[1]Pacientes de un medico'),nl,
    write('[2]Medicos de un paciente'),nl,
    write('[3] Para salir'),nl,
    write('Ingrese una opcion:'),
    read(A),
    opcion(A).
