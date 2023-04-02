package me.dio.academia.digital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import me.dio.academia.digital.entity.Aluno;
import me.dio.academia.digital.entity.Matricula;
import me.dio.academia.digital.entity.form.MatriculaForm;
import me.dio.academia.digital.repository.AlunoRepository;
import me.dio.academia.digital.repository.MatriculaRepository;

@Service
public class MatriculaServiceImpl implements IMatriculaService {
	
	 @Autowired
	  private MatriculaRepository matriculaRepository;
	 
	 @Autowired
	  private AlunoRepository alunoRepository;


	@Override
	public Matricula create(MatriculaForm form) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Matricula get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Matricula> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public List<Matricula> getAll(String bairro) {

	    if(bairro == null){
	      return matriculaRepository.findAll();
	    }else{
	      return matriculaRepository.findAlunosMatriculadosBairro(bairro);
	    }
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

	

	 

}
