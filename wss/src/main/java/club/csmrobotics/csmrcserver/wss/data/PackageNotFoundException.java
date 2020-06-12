package club.csmrobotics.csmrcserver.wss.data;

import java.text.MessageFormat;

public class PackageNotFoundException extends RuntimeException {
    public PackageNotFoundException(Long id) {
        super(MessageFormat.format("Package: {0} not found", id));
    }
}
