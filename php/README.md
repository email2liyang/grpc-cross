# run php grpc client

* install php7 in mac OS X by homebrew: `brew install php@7.1`
* [install peal on Mac OS X](https://jason.pureconcepts.net/2012/10/install-pear-pecl-mac-os-x/)
* [install composer on Mac OS X](https://getcomposer.org/doc/00-intro.md#installation-linux-unix-osx)
* install grpc extention for php: `sudo pecl install grpc`
  * this will result `extension="grpc.so"` in `/usr/local/etc/php/7.1/php.ini`
* install protobuf by homebrew: `brew install protobuf`
* use composer to download dependencies `make install`
* generate grpc php stub: `make gen_grpc_php`
* run the client, make sure the grpc server is running locally `make run_greeter_client`