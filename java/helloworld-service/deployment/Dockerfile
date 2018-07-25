FROM java:openjdk-8-alpine

ADD helloworld-service.tar /

RUN chmod +x /helloworld-service/bin/helloworld-service

RUN mkdir -p /etc/app_config

# default command to start
CMD ["/helloworld-service/bin/helloworld-service"]