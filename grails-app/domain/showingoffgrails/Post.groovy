package showingoffgrails

class Post {
    String title
    String author
    String image
    String description

    static constraints = {
        title(blank: false)
        author(blank: false)
    }

}
