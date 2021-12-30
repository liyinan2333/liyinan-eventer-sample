package liyinan.eventer.sample.handler;

import liyinan.event.anno.Async;
import liyinan.event.spi.EventHandler;
import liyinan.event.spi.Router;
import liyinan.eventer.sample.event.SayEvent;
import liyinan.eventer.sample.router.SayEventNameRouter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Handle {@link SayEvent} from LiYinan.
 *
 * @author LiYinan
 * @date 2020/2/26
 */
@Async
@Component
public class PublishEventRouterHandler extends EventHandler<SayEvent> {

    private static final Logger LOGGER = LoggerFactory.getLogger(PublishEventRouterHandler.class);

    @Override
    protected Router registRouter() {
        return new SayEventNameRouter();
    }

    @Override
    protected void handle(SayEvent event) {
        LOGGER.info("Amazing！LiYinan spoke!!");
    }

}
