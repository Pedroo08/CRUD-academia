package me.dio.academia.digital.entity.form;

import java.time.LocalDate;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class MatriculaForm {
	@NotNull(message = "Preencha o campo corretamente" )
	@Positive(message = "O Id deve ser positivo")
  private Long alunoId;

}
