package org.example;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@Getter
@FieldDefaults (level = AccessLevel.PRIVATE)
public class User {
    Integer ID;
    String name;
    String lastName;
    String email;
    String password;
}
