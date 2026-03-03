package Session16.ThucHanh;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ProductRepository implements IRespository {
    ArrayList<Product> arrayList = new ArrayList<>();
    HashMap<String, Product> hashMap = new HashMap<>();

    @Override
    public boolean add(Object item) {
        if(item != null){
            arrayList.add((Product) item);
            hashMap.put(((Product) item).getId(), (Product) item);
            return true;
        }
        return false;
    }

    @Override
    public boolean removeById(String id) {
        if(id != null){
            for(Product prod : arrayList){
                if(prod.getId().equalsIgnoreCase(id)){
                    arrayList.remove(prod);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public Object findById(String id) {
        if(id != null){
            for(Product prod : arrayList){
                if(prod.getId().equalsIgnoreCase(id)){
                    prod.displayInfo();
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public List<Product> findAll() {
        return List.of();
    }
}
