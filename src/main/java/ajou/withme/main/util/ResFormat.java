package ajou.withme.main.util;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
@ToString
@AllArgsConstructor
public class ResFormat {
    private boolean success;
    private Long status;
    private Object data;
}
