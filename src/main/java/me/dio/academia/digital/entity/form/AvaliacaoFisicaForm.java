package me.dio.academia.digital.entity.form;

import java.time.LocalDate;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class AvaliacaoFisicaForm {
  @Positive(message = "O Id deve ser positivo")
  private Long alunoId;

  @NotNull(message = "Preencha o campo corretamente" )
  @Positive(message = "O peso deve ser positivo")
  private double peso;

  @NotNull(message = "Preencha o campo corretamente" )
  @Positive(message = "a altura deve ser positivo")
  @DecimalMin(value = "150",message = "A altura precisa ser no minimo 150")
  private double altura;
}
