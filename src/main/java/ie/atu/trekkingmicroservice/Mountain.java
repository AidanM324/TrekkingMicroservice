package ie.atu.trekkingmicroservice;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Mountain {

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long Id;

    @NotBlank
    private String mountain;

    @NotBlank
    private String company;

    @Min(18)
    private int priceRange;

    @Email
    private String email;

    @NotBlank
    private String length;

    @NotBlank
    private String location;

    @NotBlank
    private String difficulty;

    @NotBlank
    private String mountainRange;



}
