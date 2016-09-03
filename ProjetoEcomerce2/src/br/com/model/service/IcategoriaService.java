package br.com.model.service;





import java.util.List;

import br.com.model.domain.Categoria;
 
public interface IcategoriaService {

	void salvar(Categoria categoria);

	void atualizar(Categoria categoria);

	void excluir(Categoria categoria);

	List<Categoria> buscar(Categoria categoria);

}