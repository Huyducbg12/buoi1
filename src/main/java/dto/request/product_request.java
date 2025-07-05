package dto.request;

import jakarta.validation.constraints.*;

public class product_request {
    @NotBlank  String productName;
    String     color;
    @Positive  Double price ;
}
