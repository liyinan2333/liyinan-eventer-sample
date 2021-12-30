package liyinan.eventer.sample.event;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author LiYinan
 * @date 2020/09/23
 */
@Data
@AllArgsConstructor
public class PongEvent {

    private String context;

}
