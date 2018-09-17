package dynamicpropdemo

import org.springframework.beans.factory.annotation.Value

class BootStrap {

    @Value('${something.else}')
    String someProperty

    def init = { servletContext ->
        log.debug "something.else: ${someProperty}"
    }

    def destroy = {
    }
}
