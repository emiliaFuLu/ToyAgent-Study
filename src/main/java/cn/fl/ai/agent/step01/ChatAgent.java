package cn.fl.ai.agent.step01;

import cn.fl.ai.agent.Agent;
import cn.fl.ai.llm.ChatModel;
import cn.fl.ai.llm.Message;
import cn.fl.ai.llm.Models;
import cn.fl.ai.llm.OpenAiChatModel;

import java.util.List;

/**
 *
 * @author <a href="mailto:fulurjj@gmail.com">FuLu</a>
 * @since 2026/11/25 16:11
 */
public interface ChatAgent extends Agent {


    class Impl implements ChatAgent {

        private final ChatModel model;

        public Impl(ChatModel model) {
            this.model = model;
        }

        @Override
        public String name() {
            return "Step01 - 对话智能体（最小MVP）";
        }

        @Override
        public String chat(String input) {
            return model.chat(List.of(Message.user(input)));
        }
    }

    public static void main(String[] args) {
        OpenAiChatModel openAiChatModel = Models.openAiOrNull();
        System.out.println(new Impl(openAiChatModel).chat("用一句话介绍你自己"));
    }

}
