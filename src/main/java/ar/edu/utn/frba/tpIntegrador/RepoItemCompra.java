package ar.edu.utn.frba.tpIntegrador;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import ar.edu.utn.frba.tpIntegrador.model.ItemCompra;

@RepositoryRestResource(path="itemsDeCompra")
public interface RepoItemCompra extends PagingAndSortingRepository<ItemCompra, Integer> {

}
