package naive.chat.protocol.friend.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private String userId;       // 用户ID
    private String userNickName; // 用户昵称
    private String userHead;     // 用户头像
    private Integer status;      // 状态；0添加、1[保留]、2已添加
}
