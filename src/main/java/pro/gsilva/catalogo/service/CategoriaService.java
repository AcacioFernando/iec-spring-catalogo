package pro.gsilva.catalogo.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import pro.gsilva.catalogo.model.Categoria;
import java.util.List;

public interface CategoriaService {
    Page<Categoria> findAll(Pageable pageable);
    Categoria findById(long id);
    Categoria save(Categoria categoria);
    void excluir(long id);

    List<Categoria> findByNome(String nome);

}
