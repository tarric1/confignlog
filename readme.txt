1) mvn clean package
2) docker build -f src/main/docker/Dockerfile.jvm -t tarric1/confignlog-jvm .
3) docker run -i --rm -p 8080:8080 tarric1/confignlog-jvm
3b) docker run -p 8080:8080 -v D:\tmp:/log -v D:\config:/config tarric1/confignlog-jvm
----------
docker build -f src/main/docker/Dockerfile.native -t tarric1/confignlog-native .
docker run -i --rm -p 8080:8080 tarric1/confignlog-native