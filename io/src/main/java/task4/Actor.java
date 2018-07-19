package task4;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.time.LocalDate;


@Value
@AllArgsConstructor
@FieldDefaults (level = AccessLevel.PRIVATE)
public class Actor implements Serializable {
    String actorname;
    String lastname;
    LocalDate dateOfBirth;
}
