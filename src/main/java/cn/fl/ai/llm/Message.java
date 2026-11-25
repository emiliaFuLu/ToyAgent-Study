package cn.fl.ai.llm;

/**
 * message body
 *
 * @author <a href="mailto:fulurjj@gmail.com">FuLu</a>
 * @since 2026/11/25 15:26
 */
public record Message(String role, String content) {

    public static Message system(String content) {
        return new Message("system", content);
    }

    public static Message user(String content) {
        return new Message("user", content);
    }

    public static Message assistant(String content) {
        return new Message("assistant", content);
    }

}
