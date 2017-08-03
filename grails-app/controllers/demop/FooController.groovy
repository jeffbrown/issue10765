package demop

import demo.Person

class FooController {

    def index() {
        respond Person.list()
    }

}
