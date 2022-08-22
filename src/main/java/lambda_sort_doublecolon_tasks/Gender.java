package lambda_sort_doublecolon_tasks;

import lombok.Getter;

@Getter
public enum Gender {

    FEMALE("female"),MALE("male");

    private String value;

    Gender(String value) {
        this.value = value;
    }
}
