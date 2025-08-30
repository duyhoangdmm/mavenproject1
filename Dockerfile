
FROM tomcat:11.0-jdk17


RUN rm -rf /usr/local/tomcat/webapps/*


COPY target/ROOT.war /usr/local/tomcat/webapps/ROOT.war


EXPOSE 9999


CMD ["catalina.sh", "run"]
