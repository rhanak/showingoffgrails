package showingoffgrails

/**
 * Created with IntelliJ IDEA.
 * User: randy
 * Date: 2/7/13
 * Time: 1:14 PM
 * To change this template use File | Settings | File Templates.
 */
class FileNameUtils {
    def static getExtensionFromFilename(filename) {
        def returned_value = ""
        def m = (filename =~ /(\.[^\.]*)$/)
        if (m.size()>0) returned_value = ((m[0][0].size()>0) ? m[0][0].substring(1).trim().toLowerCase() : "");
        return returned_value
    }
}
