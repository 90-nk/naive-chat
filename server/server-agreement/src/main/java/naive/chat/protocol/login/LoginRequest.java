package naive.chat.protocol.login;

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
public class LoginRequest extends Packet {

    private String userId;        // 用户ID
    private String userPassword;  // 用户密码

    public LoginRequest(String userId, String userPassword) {
        this.userId = userId;
        this.userPassword = userPassword;
    }
    @Override
    public Byte getCommand() {
        return Command.LoginRequest;
    }

}
