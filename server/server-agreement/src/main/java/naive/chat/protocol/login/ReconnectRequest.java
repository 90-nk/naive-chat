package naive.chat.protocol.login;

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
public class ReconnectRequest extends Packet {

    private String userId;

    @Override
    public Byte getCommand() {
        return Command.ReconnectRequest;
    }
}
