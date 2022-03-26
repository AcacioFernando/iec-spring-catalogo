package pro.gsilva.catalogo.repository;

import pro.gsilva.catalogo.model.Categoria;

import java.util.List;

public interface CustomCategoriaRepository {
    List<Categoria> findAllByNomeUpper(String nome);
}
