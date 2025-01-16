1 - Lancer l’environnement Docker :
docker-compose up -d

2 - Vérifier que le conteneur fonctionne
docker ps

3 - Se connecter au conteneur Oracle (SQLPlus)
docker exec -it oracle_23c sqlplus SYSTEM/2424@//localhost:1521/FREEPDB 1

4 - Arrêter et supprimer les conteneurs
docker-compose down