package naive.chat.protocol.talk;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import naive.chat.protocol.Command;
import naive.chat.protocol.Packet;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TalkNoticeRequest extends Packet {

    private String userId;       // 用户ID
    private String friendUserId; // 好友ID
    private Integer talkType;    // 对话框类型[0好友、1群组]
    @Override
    public Byte getCommand() {
        return Command.TalkNoticeRequest;
    }
}
