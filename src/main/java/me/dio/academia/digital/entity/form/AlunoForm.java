package me.dio.academia.digital.entity.form;


import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.br.CPF;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class AlunoForm {

 @NotEmpty(message = "Preencha o campo corretamente")
 @Size(min =30, max=50,message = "'${validatedValue}' precisa está entre {min} e {max} caracteres")
  private String nome;

 @NotEmpty(message = "Preencha o campo corretamente")
 //@CPF(message = "'${validatedValue}' é invalido ")
  private String cpf;

 @NotEmpty(message = "Preencha o campo corretamente")
 @Size(min =30, max=50,message = "'${validatedValue}' precisa está entre {min} e {max} caracteres")
  private String bairro;

 @NotNull(message = "Preencha o campo corretamente" )
 @Past(message = "Data '${validatedValue}' é invalido ")
  private LocalDate dataDeNascimento;


}
