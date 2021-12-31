package liyinan.eventer.sample.handler;

import liyinan.event.anno.Async;
import liyinan.event.spi.EventHandler;
import liyinan.eventer.sample.event.AsyncPingEvent;
import liyinan.eventer.sample.event.PingEvent;
import liyinan.eventer.sample.event.PongEvent;
import org.springframework.stereotype.Component;

/**
 * Asynchronous handle request event {@link PingEvent}.
 *
 * @author LiYinan
 * @date 2022/01/01
 */
@Async
@Component
public class RequestEventAsyncHandler extends EventHandler<AsyncPingEvent> {

    @Override
    protected Object handleRequest(AsyncPingEvent event) {
        String respContext = event.getContext().startsWith("Ping") ? "Pong." : "What?";
        return new PongEvent(respContext);
    }
}
