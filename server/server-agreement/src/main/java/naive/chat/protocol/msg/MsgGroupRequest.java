package naive.chat.protocol.msg;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import naive.chat.protocol.Command;
import naive.chat.protocol.Packet;

import java.util.Date;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MsgGroupRequest extends Packet {
    private String talkId;   // 对话框ID
    private String userId;   // 群员ID
    private String msgText;  // 传输消息内容
    private Integer msgType;  // 消息类型；0文字消息、1固定表情
    private Date msgDate;    // 消息时间
    @Override
    public Byte getCommand(){return Command.MsgGroupRequest;}

}
