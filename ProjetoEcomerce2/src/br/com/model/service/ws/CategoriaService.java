package br.com.model.service.ws;


import java.util.List;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import br.com.model.dao.CategoriaDao;
import br.com.model.domain.Categoria;
import br.com.model.service.IcategoriaService;

@WebService(serviceName="ws/categoria")
public class CategoriaService implements  IcategoriaService{
   
	@Inject
	public CategoriaDao categoriaDao;
	
	
	@Override
	@WebMethod
	public void salvar(@WebParam(name="categoria") Categoria categoria){
		categoriaDao.salvar(categoria);
	}
	
	
	@Override
	@WebMethod
	public void atualizar(@WebParam(name="categoria") Categoria categoria){
		categoriaDao.atualizar(categoria);
	}
	
	
	@Override
	@WebMethod
	public void excluir(@WebParam(name = "categoria") Categoria categoria){
		categoriaDao.excluir(categoria);
	}
	@Override
	@WebMethod
	public List<Categoria> buscar(@WebParam(name = "categoria") Categoria categoria){
		return categoriaDao.buscar(categoria);
	}
	
}

