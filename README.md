
# A test project for playing with concourse

This playground is intended to create a [CD](http://guide.agilealliance.org/guide/cd.html) pipeline.

The following requirements the pipeline must address:

1. use [Concourse CI](https://concourse-ci.org/)
2. build a Java executable jar file
3. optional: include a version number in the final file to run
4. build a docker image
   * optional: tag docker image version (same as above)
5. publish a docker image

## Java, Maven, evtl. Spring Boot

## Usage

```
# build java project
mvn package

# prepare vagrant box
vagrant init concourse/lite
vagrant up

# upload pipeline
fly -t local set-pipeline -p concourse-java-maven-test-prj -c ./pipeline.yml
```

### Where do I get 'fly' from?

As stated in the official [fly documentation](https://concourse-ci.org/fly.html),
you can download or update your fly installation from any Concourse CI installation.

With your vagrant image running, your Concourse CI should be accessible via http://192.168.100.4:8080/.
Just download fly from there.

Get a list of configured targets via

```
>>> fly targets

name   url                        expiry
local  http://192.168.100.4:8080  n/a

```