# OpenShift SSL Server

To run the server run:
```
oc process -f https://raw.githubusercontent.com/domenicbove/openshift-ssl-server/master/template.yaml | oc create -f -
```
This will automatically start a build and trigger a deployment with a secure route exposed. Hit the /secured endpoint on the route!

To cleanup
```
oc delete all -l app=ssl-server
```
