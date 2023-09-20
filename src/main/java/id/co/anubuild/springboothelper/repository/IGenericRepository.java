package id.co.anubuild.springboothelper.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface IGenericRepository<T, ID> extends JpaRepository<T, ID>, JpaSpecificationExecutor<T> {
}
