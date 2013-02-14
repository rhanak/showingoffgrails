package showingoffgrails

class BarService {

    //static rabbitSubscribe = [ name: 'my.topic', routingKey: 'bar' ]
    static rabbitQueue = 'bar'

    void handleMessage(message) {
        println message
    }

}
