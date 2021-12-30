package liyinan.eventer.sample.handler;

import liyinan.event.spi.EventHandler;
import liyinan.eventer.sample.event.PingEvent;
import liyinan.eventer.sample.event.PongEvent;
import org.springframework.stereotype.Component;

/**
 * Handle request event {@link PingEvent}.
 *
 * @author LiYinan
 * @date 2020/2/26
 */
@Component
public class RequestHandler extends EventHandler<PingEvent> {

    @Override
    protected Object handleRequest(PingEvent event) {
        String respContext = event.getContext().startsWith("Ping") ? "Pong." : "What?";
        return new PongEvent(respContext);
    }
}
