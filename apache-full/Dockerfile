#Source Image that we are going to use for building our on top of it.
FROM centos:latest

#Person/Organization that's maintaining image.
MAINTAINER Kamil

#Installing httpd because we need it to be able to start apache server.
RUN yum -y install httpd

#Copy "index.html" file from local directory into "/var/www/html/"
# "/var/www/html/" is the directory where apache is looking for content.
COPY index.html /var/www/html/

#Command that has to be executed in order to start apache.
CMD [ "/usr/sbin/httpd", "-D" "FOREGROUND" ]

#We are going to expose port 80, which is default apache server port.
EXPOSE 80
