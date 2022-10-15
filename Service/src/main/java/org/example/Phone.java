package org.example;

import lombok.NonNull;
import lombok.Value;

@Value
public class Phone {
    @NonNull
    String prefix;
    @NonNull
    String Number;
    String bonusCode;
}
