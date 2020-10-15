package com.example.demo.domain;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.With;
import org.hibernate.annotations.NaturalId;

@Entity
@Table(name = "CURRENCY")
@Data
@Builder(toBuilder = true)
@With
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Currency7 extends AbstractAuditingEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hibernateSequence")
    private Long id;

    @NaturalId
    @NotNull
    @Size(min = 3, max = 3)
    @Column(name = "alphabetic_code", length = 3, unique = true)
    private String alpCode;

    @NaturalId
    @NotNull
    @Size(min = 3, max = 3)
    @Column(name = "numeric_code", length = 3, unique = true)
    private String numCode;

    @NotNull
    @Size(max = 255)
    @Column(name = "name")
    private String name;

    @Column(name = "valid_to")
    private LocalDate validTo;

}
