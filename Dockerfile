FROM lunasec/tomcat-9.0.59-jdk11

# Copy files
ADD vulnerable-app/src/ /spring4shell/src
ADD vulnerable-app/pom.xml /spring4shell

#  Building the app
RUN apt update && apt install maven -y
WORKDIR /spring4shell/
RUN mvn clean package

#  Deploy war artifact to tomcat
RUN mv target/spring4shell.war /usr/local/tomcat/webapps/

EXPOSE 8888

# For the debugger
ENV CATALINA_OPTS="-Xdebug -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:5005"
EXPOSE 5005

CMD ["catalina.sh", "run"]
