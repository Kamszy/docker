module application.to.dockerize {

  requires spring.boot;
  requires spring.boot.autoconfigure;
  requires spring.web;

  exports com.tomtom.docker.example;

}