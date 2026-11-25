package cn.fl.ai.agent;

import java.util.List;
import java.util.Map;

/**
 * agent
 *
 * @author <a href="mailto:fulurjj@gmail.com">FuLu</a>
 * @since 2026/11/25 16:08
 */
public interface Agent {

    String name();

    String chat(String input);

    default List<Map<String, Object>> trace() {
        return List.of();
    }

    default void reset() {

    }
}
