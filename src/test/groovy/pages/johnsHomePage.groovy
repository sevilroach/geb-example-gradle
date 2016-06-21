import geb.Page


class johnsHomePage extends Page {

    static content = {
        johnsTitle { title }
        johnsHeader { $("h1 a").text() } 
    }
}
