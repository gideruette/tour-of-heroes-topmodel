cd toh-back
mvn spring-boot:build-image
cd ..
docker-compose up -d
cd toh-front
npm run start