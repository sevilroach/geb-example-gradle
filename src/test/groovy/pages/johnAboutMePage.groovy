import geb.Page

class johnAboutMePage extends Page {

    static url = "/about_john/"

    static content = {
        aboutMeTitle { title }
        johnAboutMeHeader { $("h1").text() }
    }
}