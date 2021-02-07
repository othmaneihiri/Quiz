package itfce;

import java.util.List;

public interface GlobalInterface<T> {
	public boolean Ajouter(T obj);
	public T FindById(int id);
	public List<T> FindAll();

}
