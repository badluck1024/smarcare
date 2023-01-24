FROM adoptopenjdk:12-jre-hotspot

RUN mkdir /usr/app
RUN mkdir /usr/app/smarcare

# Copy the jar file to the image
COPY smarcare-0.0.1.jar /usr/app/smarcare/smarcare.jar

WORKDIR /usr/app/smarcare

ADD entrypoint.sh entrypoint.sh
RUN chmod 777 entrypoint.sh

# Run the jar file
ENTRYPOINT ["./entrypoint.sh"]
