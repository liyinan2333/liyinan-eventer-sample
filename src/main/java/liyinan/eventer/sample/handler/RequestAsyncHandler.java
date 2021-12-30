package liyinan.eventer.sample.handler;

import liyinan.event.anno.Async;
import liyinan.event.spi.EventHandler;
import liyinan.eventer.sample.event.PingEvent;
import liyinan.eventer.sample.event.PongEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Handle request event {@link PingEvent}.
 *
 * @author LiYinan
 * @date 2020/2/26
 */
@Async
@Component
public class RequestAsyncHandler extends EventHandler<PongEvent> {

    private static final Logger LOGGER = LoggerFactory.getLogger(RequestAsyncHandler.class);

    @Override
    protected void handle(PongEvent event) {
        LOGGER.info("Handle async response......");
    }
}
