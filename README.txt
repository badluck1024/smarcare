APPLICAZIONE JAVA
Comandi da eseguire nella ROOT folder del progetto che chiameremo ${ROOT_PROJECT_FOLDER}
1) Generazione del file "target/smarcare-0.0.1-SNAPSHOT.jar":
    ./mvnw clean package -DskipTests
2) Avvio dell'applicazione java (NO ORION):
    ./mvnw spring-boot:run

- DOCKER
Comandi da eseguire nella cartella ${ROOT_PROJECT_FOLDER}/src/main/smarcare-docker (dove si trova il file docker-compose.yml)
1) Avviare solo il docker di mongo:
    docker compose -f docker-compose.yml up -d mongo
2) Avviare solo il docker di orion:
    docker compose -f docker-compose.yml up -d orion
3) Avviare solo il docker di smarcare:
    docker compose -f docker-compose.yml up -d smarcare
4) Avviare tutti i docker:
    docker compose -f docker-compose.yml up -d

- NUOVA VERSIONE APPLICAZIONE JAVA (Step 1-5)
1) Compilare il progetto:
    ./mvnw clean package -DskipTests
2) Copiare il file "target/smarcare-0.0.1.jar" nella cartella ${ROOT_PROJECT_FOLDER}/src/main/smarcare-docker
    cp .\target\smarcare-0.0.1.jar .\src\main\smarcare-docker\
3) Cambiare il numero di versione di image: smarcare:0.0.N (N è il numero di versione) nel file ${ROOT_PROJECT_FOLDER}/src/main/smarcare-docker/docker-compose.yml
4) Avviare il docker di smarcare: (Questo comando avvia il docker di smarcare con la nuova versione dell'applicazione java)
    cd ${ROOT_PROJECT_FOLDER}\src\main\smarcare-docker\
    docker compose -f docker-compose.yml up -d smarcare
5) Se i servizi di orion e mongo sono già avviati, non è necessario riavviarli.

COMANDI UTILI
1) Rimuovere i dati visualizzati da ORION:
    docker-compose rm -f -s -v mongo
2) Rimuovere tutti i docker:
    docker-compose rm -f -s -v

GITHUB
git repo del progetto: https://github.com/badluck1024/smarcare



