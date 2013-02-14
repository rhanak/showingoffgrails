import groovy.sql.Sql
import showingoffgrails.Post

class BootStrap {

    def dataSource
    def grailsApplication

    def init = { servletContext ->

        String sqlString = grailsApplication.mainContext.getResource('classpath:/data/schema.sql').inputStream.text
        new Sql(dataSource) .execute(sqlString)

        def directoryName = 'web-app/images/posts/'
        println "Removing upload images in ${directoryName} and its subdirectories..."
        def directory = new File(directoryName)
        directory.eachFileMatch ~/upload.*/, { File f -> f.delete() }


        new Post(title: 'First Post', author: 'John', image: 'news.png', description:'My first post on this site, I hope it goes well!').save()
        new Post(title: 'Second Post', author: 'Bob', image: 'news_paperclip.png', description:'Ok I am getting more comfortable, I learn fast.').save()
        new Post(title: 'Third Post', author: 'Jim', image: 'news_yellow.png', description:'What do you think of these great icons?').save()
        new Post(title: 'Fourth Post', author: 'Kyle', image: 'sold_out.png', description:'No they are not free we have to pay for them if we want them.').save()
        new Post(title: 'Fifth Post', author: 'Doug', image: 'zeitung.png', description:'But they are pretty cheap').save()
    }
    def destroy = {
    }
}
