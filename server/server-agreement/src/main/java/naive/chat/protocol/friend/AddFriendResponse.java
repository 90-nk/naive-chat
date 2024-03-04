package naive.chat.protocol.friend;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import naive.chat.protocol.Command;
import naive.chat.protocol.Packet;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddFriendResponse extends Packet {

    private String friendId;
    private String friendNickName;
    private String friendHead;

    @Override
    public Byte getCommand() {
        return Command.AddFriendResponse;
    }
}
