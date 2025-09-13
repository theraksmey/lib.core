package dev.raksmey.util;


import dev.raksmey.dto.UserRandomDto;
import dev.raksmey.dto.UserSmallDto;

import java.util.Random;
import java.util.UUID;

public class RandomUserUtil {

    private static final String[] FIRST_NAMES = {
            "John", "Alice", "Robert", "Sophia", "David", "Emma", "James", "Olivia"
    };

    private static final String[] LAST_NAMES = {
            "Smith", "Johnson", "Brown", "Taylor", "Anderson", "Lee", "Martin", "Clark"
    };

    private static final String[] CITIES = {
            "New York", "Los Angeles", "Chicago", "Houston", "Miami", "Boston", "San Francisco"
    };

    private final Random random = new Random();

    public UserRandomDto generateRandomUser() {
        String firstName = FIRST_NAMES[random.nextInt(FIRST_NAMES.length)];
        String lastName = LAST_NAMES[random.nextInt(LAST_NAMES.length)];
        String username = (firstName + lastName + random.nextInt(1000)).toLowerCase();
        String email = username + "@example.com";
        String phone = "+1" + (1000000000L + random.nextInt(900000000));
        String address = (random.nextInt(999) + 1) + " " + LAST_NAMES[random.nextInt(LAST_NAMES.length)] + " Street";
        String city = CITIES[random.nextInt(CITIES.length)];

        return UserRandomDto.builder()
                .username(username)
                .password(UUID.randomUUID().toString().substring(0, 8)) // random password
                .firstName(firstName)
                .lastName(lastName)
                .email(email)
                .phone(phone)
                .address(address)
                .city(city)
                .build();
    }

    public UserSmallDto generateRandomUserSmall() {
        String firstName = FIRST_NAMES[random.nextInt(FIRST_NAMES.length)];
        String lastName = LAST_NAMES[random.nextInt(LAST_NAMES.length)];
        String username = (firstName + lastName + random.nextInt(1000)).toLowerCase();
        Long userId = random.nextLong(999) + 1;
        return UserSmallDto.builder()
                .userId(userId)
                .username(username)
                .build();
    }
}
