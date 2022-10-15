package org.example;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Runner {
    public static void main(String[] args) {
        Phone phone1 = new Phone("+7", "00000023", null);
        Phone phone2 = new Phone("+7", "00000023", "203");
        log.info(PhoneUtil.getPhoneWithCode(phone1));
        log.info(PhoneUtil.getPhoneWithCode(phone2));
    }
}
