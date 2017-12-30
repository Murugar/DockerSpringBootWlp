FROM websphere-liberty


RUN mkdir -p /tmp/db/migration

COPY target/classes/db/migration /tmp/db/migration
COPY server.xml /opt/ibm/wlp/usr/servers/defaultServer/
COPY target/SpringBootWlp-1.0.war /opt/ibm/wlp/usr/servers/defaultServer/dropins/

RUN installUtility install --acceptLicense defaultServer
