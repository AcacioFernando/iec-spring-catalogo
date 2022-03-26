package pro.gsilva.catalogo.repository;

import pro.gsilva.catalogo.model.Categoria;

import javax.persistence.EntityManager;
import java.util.List;

public class CustomCategoriaRepositoryImpl implements CustomCategoriaRepository {

    private final EntityManager em;

    public CustomCategoriaRepositoryImpl(EntityManager em) {
        this.em = em;
    }

    @Override
    public List<Categoria> findAllByNomeUpper(String nome) {
        String nomeUpper = nome.toUpperCase();
        return em.createQuery("select m from Categoria m where m.nome = :nome", Categoria.class)
                .setParameter("nome", nomeUpper)
                .getResultList();
    }
}
