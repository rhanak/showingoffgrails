package showingoffgrails

import com.simongo.math.Imaginary

class PostController {
    def postService
    def mathService

    def index() {
         [posts: postService.getPosts()]
    }

    def newPost() {
        if (params.title && params.description && params.image) {
            def file = request.getFile('image')
            if (file && !file.empty) {
                def fileName = file.getOriginalFilename()
                def extension = FileNameUtils.getExtensionFromFilename(fileName)
                def imageFileName = 'upload' + postService.getLastImageId() + '.' + extension
                file.transferTo(new java.io.File('web-app/images/posts/' + imageFileName ))
                flash.message = 'Image uploaded'

                new Post(title: params.title, author:  'me', description: params.description, image: imageFileName).save()
            }
        }



        redirect(action: "index")
    }

    def sendMessage() {
        rabbitSend 'my.topic', 'bar.blah', 'someMessage'
    }

    def sendAcmeMessage() {
            println mathService.add((Long)1, (Long)2)
    }
}
