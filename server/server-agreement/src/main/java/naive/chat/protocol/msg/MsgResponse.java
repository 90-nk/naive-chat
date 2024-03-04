package naive.chat.protocol.msg;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import naive.chat.protocol.Command;
import naive.chat.protocol.Packet;

import javax.xml.crypto.Data;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MsgResponse extends Packet {
    private String friendId; // 朋友id
    private String msgText; //消息内容
    private Date msgDate; //消息时间
    private Integer msgType; //消息类型 0 for txt, 1 for emoji

    @Override
    public Byte getCommand(){return Command.MsgResponse;}
}
