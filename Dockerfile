FROM openjdk:11-jdk
ARG JAR_FILE=./build/libs/*.jar
# Add into docker container
COPY ${JAR_FILE} app.jar
# Access permission to wait-for-it.sh
#COPY ./scripts/deploy/wait-for-it.sh scripts/wait-for-it.sh
#RUN chmod +x scripts/wait-for-it.sh
# Add secret yml file
COPY ./application-dev.yml /resources/application-dev.yml
# Execute app.jar when running docker
EXPOSE 8080
#ENTRYPOINT ["scripts/wait-for-it.sh", "database:3306", "--", "java", "-jar", "app.jar",  "--spring.profiles.active=dev", "--spring.config.additional-location=resources/application-dev.yml"]
CMD java -jar app.jar --spring.profiles.active=dev --spring.config.additional-location=resources/application-dev.yml
