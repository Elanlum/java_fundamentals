package task4;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Value;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;

@Value
@FieldDefaults (level = AccessLevel.PRIVATE)
@AllArgsConstructor
public class Film implements Serializable {
    String filmname;
    int prodyear;
    Actor mainActor;
}
