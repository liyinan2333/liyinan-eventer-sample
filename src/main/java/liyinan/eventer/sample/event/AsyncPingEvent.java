package liyinan.eventer.sample.event;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author LiYinan
 * @date 2022/01/01
 */
@Data
@AllArgsConstructor
public class AsyncPingEvent {

    private String context;

}
