rm -rf ./docker
gradlew clean
gradlew build -x test
mkdir docker
cp ./build/libs/dynamiccors-0.0.1-SNAPSHOT.jar ./docker/app.jar
cd docker
jar -xf ./app.jar
cd ..

docker build -t oat431/dynamiccors:latest .
docker push oat431/dynamiccors:latest