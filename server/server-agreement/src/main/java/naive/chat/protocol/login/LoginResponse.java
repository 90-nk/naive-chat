package naive.chat.protocol.login;

import lombok.Getter;
import lombok.Setter;
import naive.chat.protocol.Command;
import naive.chat.protocol.Packet;
import naive.chat.protocol.login.dto.ChatTalkDto;
import naive.chat.protocol.login.dto.GroupsDto;
import naive.chat.protocol.login.dto.UserFriendDto;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
public class LoginResponse extends Packet {

    private boolean success;                    // 登陆反馈
    private String userId;                      // 用户ID
    private String userHead;                    // 用户头像
    private String userNickName;                // 用户昵称
    private List<ChatTalkDto> chatTalkList = new ArrayList<>();     // 聊天对话框数据[success is true]
    private List<GroupsDto> groupsList = new ArrayList<>();         // 群组列表
    private List<UserFriendDto> userFriendList = new ArrayList<>(); // 好友列表

    public LoginResponse(){} //无参构造

    public LoginResponse(boolean success){
        this.success = success;
    }//是否成功构造


    @Override
    public Byte getCommand() {
        return Command.LoginResponse;
    }

}




