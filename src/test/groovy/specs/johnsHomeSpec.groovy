import geb.spock.GebReportingSpec



class johnsHomeSpec extends GebReportingSpec {

    @Issue("https://github.com/SevilRoach/geb-example-gradle/issues/1")
    def "can get to the current Johns Home Page"() {
        when: "the user goes to home page"
        to johnsHomePage

        then: "the title is set "
        assert johnsTitle == "John Roach | Coding For Life"
    }

    def "check if the header is John Roach"() {
        when: "the user goes to home page"
        to johnsHomePage

        then: "check the header is correct"
        assert johnsHeader == "John Roach"
    } 
}

