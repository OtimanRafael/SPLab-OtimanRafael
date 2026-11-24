package ro.uvt.info.splabotimanrafael2026.persistence;

import java.util.List;

public interface CrudRepository<T, ID> {
    List<T> findAll();
    T save(T entity);
}