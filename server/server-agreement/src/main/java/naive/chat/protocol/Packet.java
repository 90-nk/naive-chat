package naive.chat.protocol;

import naive.chat.protocol.friend.AddFriendRequest;
import naive.chat.protocol.friend.AddFriendResponse;
import naive.chat.protocol.friend.SearchFriendRequest;
import naive.chat.protocol.friend.SearchFriendResponse;
import naive.chat.protocol.login.LoginRequest;
import naive.chat.protocol.login.LoginResponse;
import naive.chat.protocol.msg.MsgGroupRequest;
import naive.chat.protocol.msg.MsgGroupResponse;
import naive.chat.protocol.msg.MsgRequest;
import naive.chat.protocol.msg.MsgResponse;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


public abstract class Packet {

    private final static Map<Byte, Class<? extends Packet>> packetType = new ConcurrentHashMap<>();

    static {
        packetType.put(Command.LoginRequest, LoginRequest.class);
        packetType.put(Command.LoginResponse, LoginResponse.class);
    }

    public static Class<? extends Packet> get(Byte command) {
        return packetType.get(command);
    }

    /**
     * 获取协议指令
     *
     * @return 返回指令值
     */
    public abstract Byte getCommand();

}
