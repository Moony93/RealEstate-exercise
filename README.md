Testo dell'esercizio

Si definisca una gerarchia di classi per rappresentare le case vendute da un'agenzia immobiliare.
Le case possono essere di due tipi: Appartamenti e Ville.
Per ogni casa si rappresenti: la superficie ed il numero di stanze.

Inoltre per gli appartamenti si rappresenti il codice energetico (un intero).
Per le ville si rappresenti il fatto che abbiano o no una piscina.

Entrambe le classsi contengono un metodo che restituisce il costo della casa.

Per gli appartamenti il costo è il prodotto fra la superficie e 1500, più il prodotto fra il numero delle stanze ed il codice energetico.

Per le ville il costo è il prodotto fra la superficie e 2000, più 20000 se c'è una piscina, più 10000 se ci sono almeno 10 stanze.
Si definisca una classe Archivio che contiene come campo un array in cui è possibile inserire sia appartamenti che ville.

Si definisca infine un metodo della classe archivio che, dato uin parametro N, restituisce la media dei costi di tutte le case presenti nel campo la cui superficie superi N.
