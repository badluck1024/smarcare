FROM adoptopenjdk:12-jre-hotspot

RUN mkdir /usr/app
RUN mkdir /usr/app/smarcare

# Copy the jar file to the image
ADD ../../../../target/smarcare-0.0.1-SNAPSHOT.jar /smarcare.jar

#WORKDIR /usr/app/smarcare

# Run the jar file
ENTRYPOINT ["java","-jar","smarcare.jar"]
