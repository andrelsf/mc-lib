# MC-Lib

* [Maven install library local](https://crunchify.com/maven-artifacts-error-jms-jmxtools-jmxri-dependencies/)
```shell
mvn clean install package
mvn install:install-file \
    -Dfile=target/mc-lib-1.0.0.jar \
    -DgroupId=br.dev.multicode \
    -DartifactId=mc-lib \
    -Dversion=1.0.0 \
    -Dpackaging=jar
```