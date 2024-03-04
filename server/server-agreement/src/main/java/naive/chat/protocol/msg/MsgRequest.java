package naive.chat.protocol.msg;

import lombok.*;
import naive.chat.protocol.Command;
import naive.chat.protocol.Packet;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MsgRequest extends Packet {
    private String userId; //用户id
    private String friendId; //好友id
    private String msgText; //消息内容
    private Integer msgType;//消息类型, 0 for txt, 1 for emoji
    private Date msgDate;//消息时间

    @Override
    public Byte getCommand(){return Command.MsgRequest;}

}
