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
public class SearchFriendRequest extends Packet {

    private String userId;     // 用户ID
    private String searchKey;  // 搜索字段

    @Override
    public Byte getCommand() {
        return Command.SearchFriendRequest;
    }

}
