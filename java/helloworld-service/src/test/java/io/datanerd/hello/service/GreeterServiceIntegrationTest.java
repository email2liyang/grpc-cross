/*
 * Copyright (c) 2018 Practice Insight Pty Ltd.
 */

package io.datanerd.hello.service;

import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.datanerd.generated.helloworld.GreeterGrpc;
import io.datanerd.generated.helloworld.HelloReply;
import io.datanerd.generated.helloworld.HelloRequest;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

/**
 * @author ivan
 */
public class GreeterServiceIntegrationTest {

  private static Logger log = LoggerFactory.getLogger(GreeterServiceIntegrationTest.class); //NOPMD

  @Test
  @Ignore
  public void testLocalServer() {
    ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8080)
        .usePlaintext(true)
        .build();
    GreeterGrpc.GreeterBlockingStub stub = GreeterGrpc.newBlockingStub(channel);

    HelloReply helloReply = stub.sayHello(HelloRequest.newBuilder().setName("ivan").build());
    log.info(" reply is {}", helloReply);
  }
}
