package business.objects;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MobileDevice {

    private String udid;
    private String platformName;
    private int systemPort;
}
