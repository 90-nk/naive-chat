package naive.chat.protocol.talk;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import naive.chat.protocol.Command;
import naive.chat.protocol.Packet;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DelTalkRequest extends Packet {

    private String userId;  // 用户ID
    private String talkId;  // 对话框ID



    @Override
    public Byte getCommand() {
        return Command.DelTalkRequest;
    }
}
