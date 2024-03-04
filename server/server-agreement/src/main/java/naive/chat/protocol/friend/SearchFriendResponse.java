package naive.chat.protocol.friend;

import naive.chat.protocol.Command;
import naive.chat.protocol.Packet;
import naive.chat.protocol.friend.dto.UserDto;

import java.util.List;


public class SearchFriendResponse extends Packet {

    private List<UserDto> list;

    public List<UserDto> getList() {
        return list;
    }

    public void setList(List<UserDto> list) {
        this.list = list;
    }

    @Override
    public Byte getCommand() {
        return Command.SearchFriendResponse;
    }
}
