package showingoffgrails

class PostService {
    def sessionFactory

    def getPosts() {
           return Post.list()
    }

    def getLastImageId(){
        def sql = "call NEXT VALUE FOR images_seq"
        def query = sessionFactory.currentSession.createSQLQuery(sql);
        def result = query.list()
        return result[0]
    }
}
