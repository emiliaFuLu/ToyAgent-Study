package cn.fl.ai.llm;

import java.util.List;

/**
 * chatmodel
 *
 * @author <a href="mailto:fulurjj@gmail.com">FuLu</a>
 * @since 2026/11/25 15:22
 */
public interface ChatModel {

    String chat(List<Message> messages);

}
