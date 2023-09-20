package id.co.anubuild.springboothelper.service;

import id.co.anubuild.springboothelper.repository.IGenericRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

public abstract class IGenericService<T, ID, REPO extends IGenericRepository<T, ID>> {

    private final REPO repo;

    protected IGenericService(REPO repo) {
        this.repo = repo;
    }

    T saveOrUpdate(T t) {
        return repo.save(t);
    };
    T getById(ID id) {
        return repo.findById(id).orElse(null);
    };
    List<T> getAll() {
        return repo.findAll();
    };
    Page<T> getAllWithPagination(int page, int load) {
        return repo.findAll(PageRequest.of(page, load));
    };
    Boolean delete(T t) {
        try {
            repo.delete(t);
            return true;
        } catch (Exception e) {
            return false;
        }
    };

}
