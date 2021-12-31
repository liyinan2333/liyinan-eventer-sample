package liyinan.eventer.sample.event;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author LiYinan
 * @date 2021/09/23
 */
@Data
@AllArgsConstructor
public class PingEvent {

    private String context;

}
