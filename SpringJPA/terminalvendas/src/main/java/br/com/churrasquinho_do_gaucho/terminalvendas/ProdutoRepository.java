package br.com.churrasquinho_do_gaucho.terminalvendas;

import org.springframework.data.repository.PagingAndSortingRepository;

@RepositoryRestRisource(collectionResourceRel = "produto", path= "produto")
public interface ProdutoRepository extends PagingAndSortingRepository<Produto, Integer>{
	

}
