package naive.chat.protocol.friend;

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
public class AddFriendRequest extends Packet {

    private String userId;    // 用户ID[自己的ID]
    private String friendId;  // 好友ID
    @Override
    public Byte getCommand() {
        return Command.AddFriendRequest;
    }

}
