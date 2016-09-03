package br.com.model.service.rs;

import java.util.List;

import javax.inject.Inject;
import br.com.model.dao.CategoriaDao;
import br.com.model.domain.Categoria;
import br.com.model.service.IcategoriaService;

public class CategoriaService implements  IcategoriaService{
	   
		@Inject
		public CategoriaDao categoriaDao;
				
		public void salvar(Categoria categoria){
			categoriaDao.salvar(categoria);
		}
				
		public void atualizar( Categoria categoria){
			categoriaDao.atualizar(categoria);
		}
		
		public void excluir( Categoria categoria){
			categoriaDao.excluir(categoria);
		}
		
		public List<Categoria> buscar( Categoria categoria){
			return categoriaDao.buscar(categoria);
		}
		
	}

