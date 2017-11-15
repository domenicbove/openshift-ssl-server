# OpenShift Image Scanner

To build image
```
oc process -f template.yml | oc create -f -
mvn clean package
oc start-build ssl-server --from-file=target/ssl-server-0.0.1-SNAPSHOT.jar
```
After the build completes, a deployment will be triggered with a secure route exposed.
Hit the /secured endpoint on the route!
