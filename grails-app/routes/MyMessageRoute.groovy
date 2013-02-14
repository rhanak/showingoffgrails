

import org.apache.camel.builder.RouteBuilder

class MyMessageRoute extends RouteBuilder {
	def grailsApplication

    @Override
    void configure() {
		def config = grailsApplication?.config

        // example:
         //from("direct:say").marshal().xstream().to("spring-amqp:acmeExchange:mathQueue:math?type=direct")
         from("direct:say").to("spring-amqp:acmeExchange:mathQueue:math?type=direct")


         //unmarshal().serialization()
         //from("spring-amqp:acmeExchange:mathQueue:math?type=direct").unmarshal().xstream().to("direct:say")
    }
}
