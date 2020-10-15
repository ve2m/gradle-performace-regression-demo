package com.example.demo;

import java.io.Serializable;
import java.time.LocalDate;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class CurrencyDTO implements Serializable {

    private String id;

    @NotNull
    private String alpCode;

    @NotNull
    private String numCode;

    @NotNull
    private String name;

    private LocalDate validTo;

}
