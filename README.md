
# A test project for playing with concourse

This playground is intended to create a [CD](http://guide.agilealliance.org/guide/cd.html) pipeline.

The following requirements the pipeline must address:

1. use [Concourse CI](http://concourse.ci/)
2. build a Java executable jar file
3. optional: include a version number in the final file to run
4. build a docker image
   * optional: tag docker image version (same as above)
5. publish a docker image

## Java, Maven, evtl. Spring Boot

## Usage

```
# build java project
maven package

# prepare vagrant box
vagrant init concourse/lite
vagrant up

# upload pipeline
fly set-pipeline -p concourse-java-maven-test-prj -c ./pipeline.yml
```