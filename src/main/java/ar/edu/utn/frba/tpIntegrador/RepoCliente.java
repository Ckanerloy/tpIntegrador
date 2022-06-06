package ar.edu.utn.frba.tpIntegrador;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import ar.edu.utn.frba.tpIntegrador.model.Cliente;

@RepositoryRestResource(path="clientes")
public interface RepoCliente extends PagingAndSortingRepository<Cliente, Integer> {

}
