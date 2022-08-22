package lambda_sort_doublecolon_tasks;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Address {

    private Integer id;
    private String Street;
    private String City;
    private String state;
    private String zipCode;
}
