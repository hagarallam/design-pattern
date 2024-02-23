package observer;

import java.math.BigDecimal;

public interface Observer {

    void update(BigDecimal phonePrice , BigDecimal pcPrice);
}
