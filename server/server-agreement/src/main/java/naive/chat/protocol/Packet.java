package naive.chat.protocol;

import naive.chat.protocol.friend.AddFriendRequest;
import naive.chat.protocol.friend.AddFriendResponse;
import naive.chat.protocol.friend.SearchFriendRequest;
import naive.chat.protocol.friend.SearchFriendResponse;
import naive.chat.protocol.login.LoginRequest;
import naive.chat.protocol.login.LoginResponse;
import naive.chat.protocol.login.ReconnectRequest;
import naive.chat.protocol.msg.MsgGroupRequest;
import naive.chat.protocol.msg.MsgGroupResponse;
import naive.chat.protocol.msg.MsgRequest;
import naive.chat.protocol.msg.MsgResponse;
import naive.chat.protocol.talk.DelTalkRequest;
import naive.chat.protocol.talk.TalkNoticeRequest;
import naive.chat.protocol.talk.TalkNoticeResponse;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


public abstract class Packet {

    private final static Map<Byte, Class<? extends Packet>> packetType = new ConcurrentHashMap<>();

    static {
        packetType.put(Command.LoginRequest, LoginRequest.class);
        packetType.put(Command.LoginResponse, LoginResponse.class);
        packetType.put(Command.MsgRequest, MsgRequest.class);
        packetType.put(Command.MsgResponse, MsgResponse.class);
        packetType.put(Command.TalkNoticeRequest, TalkNoticeRequest.class);
        packetType.put(Command.TalkNoticeResponse, TalkNoticeResponse.class);
        packetType.put(Command.SearchFriendRequest, SearchFriendRequest.class);
        packetType.put(Command.SearchFriendResponse, SearchFriendResponse.class);
        packetType.put(Command.AddFriendRequest, AddFriendRequest.class);
        packetType.put(Command.AddFriendResponse, AddFriendResponse.class);
        packetType.put(Command.DelTalkRequest, DelTalkRequest.class);
        packetType.put(Command.MsgGroupRequest, MsgGroupRequest.class);
        packetType.put(Command.MsgGroupResponse, MsgGroupResponse.class);
        packetType.put(Command.ReconnectRequest, ReconnectRequest.class);

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
