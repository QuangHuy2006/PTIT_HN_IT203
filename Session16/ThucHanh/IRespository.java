package Session16.ThucHanh;

import java.util.List;

public interface IRespository<T> {
    boolean add(T item);
    boolean removeById(String id);
    T findById(String id);
    List<T> findAll();
}
