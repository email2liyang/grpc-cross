clean:
	./gradlew clean
buildTar:
	./gradlew build
runLocalServer:
	./gradlew run
imageHelloService:
	cp build/distributions/helloworld-service.tar deployment/
	pushd deployment && \
	docker build -t email2liyang/helloworld-service:1.0.5 . && \
	rm helloworld-service.tar && \
	popd