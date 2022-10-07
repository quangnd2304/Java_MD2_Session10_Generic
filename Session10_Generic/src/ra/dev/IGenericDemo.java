package ra.dev;

public interface IGenericDemo<E> {
    void create(E element);
    void getAll();
    void update(E element);
    void delete(E element);
}
