import geb.spock.GebReportingSpec


class johnAboutMePageSpec extends GebReportingSpec {

    def "check if the title is correct"() {
        when: 
        to johnAboutMePage

        then:
        assert aboutMeTitle == "About Me | John Roach"
    }

    def "check if the header is About Me"() {
        when:
        to johnAboutMePage

        then:
        assert johnAboutMeHeader == "About Me"
    }
}