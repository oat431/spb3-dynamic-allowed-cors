FROM openjdk:17-alpine
RUN addgroup -S spring && adduser -S spring -G spring
EXPOSE 9099

ENV JAVA_PROFILE dev
ARG DEPENDENCY=docker
COPY ${DEPENDENCY}/BOOT-INF/lib /app/lib
COPY ${DEPENDENCY}/META-INF /app/META-INF
COPY ${DEPENDENCY}/BOOT-INF/classes /app

ENTRYPOINT ["java",   "-Dspring.profiles.active=${JAVA_PROFILE}",\
            "-cp","app:app/lib/*","panomete.playground.dynamiccors.DynamiccorsApplication"]