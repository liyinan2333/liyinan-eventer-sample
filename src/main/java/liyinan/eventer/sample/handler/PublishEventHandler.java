package liyinan.eventer.sample.handler;

import liyinan.event.spi.EventHandler;
import liyinan.eventer.sample.event.SayEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Handle {@link SayEvent}.
 *
 * @author LiYinan
 * @date 2020/2/26
 */
@Component
public class PublishEventHandler extends EventHandler<SayEvent> {

    private static final Logger LOGGER = LoggerFactory.getLogger(PublishEventHandler.class);

    @Override
    protected void handle(SayEvent event) {
        LOGGER.info("Someone said: {}", event.getMessage());
    }
}
