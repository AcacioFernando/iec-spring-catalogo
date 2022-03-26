package pro.gsilva.catalogo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pro.gsilva.catalogo.model.Categoria;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>, CustomCategoriaRepository {
    List<Categoria> findAllByNomeUpper(String titulo);
    // List<Categoria> findAllByTituloIsLike(String titulo);

    @Query("select m from Categoria m where m.nome like :nome")
    List<Categoria> findAllWithNomeLike(String nome);

//    @Query("select m from Musica m join m.categoria c where c.id = :categoriaId")
//    List<Musica> findAllByCategoriaId(Long categoriaId);
}