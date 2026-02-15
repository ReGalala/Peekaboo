package com.example.peekapp;
import com.hivemq.client.mqtt.MqttClient;
import com.hivemq.client.mqtt.mqtt5.Mqtt5BlockingClient;

import static com.hivemq.client.mqtt.MqttGlobalPublishFilter.ALL;
import static java.nio.charset.StandardCharsets.UTF_8;

//JAR file from https://jar-download.com/download-handling.php
public class MainTest {

        public static void main(String[] args) throws Exception {

            final String host = "638e597d0527493ba56a670b993e0b54.s1.eu.hivemq.cloud";
            final String username = "peekapp";
            final String password = "Peekapp@1";

            // create an MQTT client
            //https://javadoc.io/static/com.hivemq/hivemq-mqtt-client/1.2.2/com/hivemq/client/mqtt/MqttClientBuilder.html
            // https://www.oracle.com/corporate/features/simple-messaging-with-mqtt.html
            //https://console.hivemq.cloud/clients/java-hivemq
            final Mqtt5BlockingClient client = MqttClient.builder()
                    .useMqttVersion5()
                    .serverHost(host)
                    .serverPort(8883)
                    .sslWithDefaultConfig()
                    .buildBlocking();

            // connect to HiveMQ Cloud with TLS and username/pw
            client.connectWith()
                    .simpleAuth()
                    .username(username)
                    .password(UTF_8.encode(password))
                    .applySimpleAuth()
                    .send();

            System.out.println("Connected successfully");

            // subscribe to the topic "my/test/topic"
            client.subscribeWith()
                    .topicFilter("bathroom/temp")
                    .send();

            // set a callback that is called when a message is received (using the async API style)

            client.toAsync().publishes(ALL, publish -> {
                System.out.println("Received message: " +
                        publish.getTopic() + " -> " +
                        UTF_8.decode(publish.getPayload().get()));

                // disconnect the client after a message was received
                //client.disconnect();
            });


            // publish a message to the topic "my/test/topic"
//            client.publishWith()
//                    .topic("my/test/topic")
//                    .payload(UTF_8.encode("Hello"))
//                    .send();
        }
    }

