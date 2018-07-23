<?php

require dirname(__FILE__) . '/vendor/autoload.php';
@include_once dirname(__FILE__) . '/Helloworld/GreeterClient.php';
@include_once dirname(__FILE__) . '/Helloworld/HelloRequest.php';
@include_once dirname(__FILE__) . '/Helloworld/HelloReply.php';
@include_once dirname(__FILE__) . '/GPBMetadata/Helloworld.php';

function great($name)
{
    $client = new Helloworld\GreeterClient('localhost:8080', [
        'credentials' => Grpc\ChannelCredentials::createInsecure(),
    ]);

    $request = new Helloworld\HelloRequest();
    $request->setName($name);

    list($reply,$status) = $client->SayHello($request)->wait();

    return $reply->getMessage();
}

$name = !empty($argv[1]) ? $argv[1] : 'world';
echo great($name)."\n";
