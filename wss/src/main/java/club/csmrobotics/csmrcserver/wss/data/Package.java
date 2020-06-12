package club.csmrobotics.csmrcserver.wss.data;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

/**
 * <p>
 * simple class representing data from the ras pi
 * must be separated to different files in later versions
 * variables names are unpleasant
 * </p>
 */
@lombok.Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Package {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date date;
    private float temp;
    private float pressPa;
    private float hum;
    private float CO2ppm;
    private float tVOCpp;
    private long count;
    private long packetNum;
    private int deviceInfo;
    @Version
    private Long version;
}
