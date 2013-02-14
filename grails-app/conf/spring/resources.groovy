// Place your Spring DSL code here
beans = {
    mathService(org.apache.camel.spring.remoting.CamelProxyFactoryBean) {
        serviceUrl = "direct:say"
        serviceInterface = "com.simongo.service.MathService"
    }

    xstream(amqp.spring.converter.XStreamConverter)
}

