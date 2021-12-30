package liyinan.eventer.sample.router;

import liyinan.event.spi.Router;
import liyinan.eventer.sample.event.SayEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Route {@link SayEvent} from LiYinan.
 */
public class SayEventNameRouter implements Router<SayEvent> {

    private static Logger LOGGER =  LoggerFactory.getLogger(SayEventNameRouter.class);

    @Override
    public boolean route(SayEvent event) {
        if ("LiYinan".equals(event.getName())) {
            LOGGER.info("Messages matching to LiYinan");
            return true;
        }
        return false;
    }
}
