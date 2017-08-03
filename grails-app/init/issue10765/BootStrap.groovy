package issue10765

import demo.Person

class BootStrap {

    def init = { servletContext ->
        new Person(firstName: 'Chris', lastName: 'Squire').save()
        new Person(firstName: 'Robert', lastName: 'Fripp').save()

    }
    def destroy = {
    }
}
