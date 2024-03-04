package naive.chat.protocol.talk;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import naive.chat.protocol.Command;
import naive.chat.protocol.Packet;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TalkNoticeResponse extends Packet {

    private String talkId;     // 对话框ID[好友ID、群ID]
    private String talkName;   // 对话框名称[好友名称、群名称]
    private String talkHead;   // 对话框头像[好友头像、群头像]
    private String talkSketch; // 消息简讯
    private Date talkDate;     // 消息时间
    @Override
    public Byte getCommand() {
        return Command.TalkNoticeResponse;
    }

}
