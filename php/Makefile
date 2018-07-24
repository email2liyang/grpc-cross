install:
	composer install
gen_grpc_php:
	protoc --proto_path=./../protos  --php_out=./  --grpc_out=./ --plugin=protoc-gen-grpc=/usr/local/bin/grpc_php_plugin ./../protos/helloworld.proto
run_greeter_client:
	php -d max_execution_time=300 greeter_client.php