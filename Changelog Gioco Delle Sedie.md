\# Gioco delle Sedie - Registro delle Modifiche

\## \[v1.0.0\] - Versione Iniziale - Implementata la struttura di base
del gioco delle sedie:  - Classe \`Posto\` per rappresentare un posto
occupabile.  - Classe \`Display\` per monitorare lo stato dei posti in
tempo reale.  - Classe \`Partecipante\` per rappresentare i concorrenti
che cercano di occupare i posti.  - Classe principale
\`Menculini_Gioco_Sedie\` per orchestrare il gioco. - Il gioco utilizza
thread per simulare i partecipanti e il monitoraggio concorrente.

\## \[v1.1.0\] - Implementazione della Scrittura su File \### Nuova
funzionalità: - Aggiunta della classe \`Scrittore\` per registrare in un
file di testo le azioni dei partecipanti che riescono a occupare un
posto.  - Il file di output, denominato \`Risultato.txt\`, contiene una
riga per ogni partecipante che ha occupato un posto, nel formato: \`\`\`
IL thread \[ID_PARTECIPANTE\] occupa il posto \[NUMERO_POSTO\] \`\`\`
\### Modifiche alla classe \`Partecipante\`: - Aggiunto un costruttore
che accetta un\'istanza di \`Scrittore\` e un ID univoco per ogni
partecipante. - Aggiunto il metodo \`scrivi\` per registrare l\'azione
nel file non appena un posto viene occupato.

\### Modifiche alla classe \`Menculini_Gioco_Sedie\`: - Integrazione
della classe \`Scrittore\` nel metodo \`main\`. - Passaggio
dell\'istanza di \`Scrittore\` e dell\'ID univoco a ogni oggetto
\`Partecipante\`.

\## \[v1.1.1\] - Correzione della Sovrascrittura del File - Modificata
la classe \`Scrittore\` per aprire il file in modalità \"append\" invece
di sovrascriverlo. - Ora ogni chiamata al metodo \`scrivi\` aggiunge una
nuova riga al file invece di cancellare il contenuto precedente.

\## \[v1.2.0\] - Aggiunta della Documentazione - Aggiunti commenti in
formato JavaDoc per documentare tutte le classi e i metodi.
