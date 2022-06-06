package ar.edu.utn.frba.tpIntegrador;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import ar.edu.utn.frba.tpIntegrador.model.Rol;

@RepositoryRestResource(path="roles")
public interface RepoRol extends PagingAndSortingRepository<Rol, Integer> {

}
