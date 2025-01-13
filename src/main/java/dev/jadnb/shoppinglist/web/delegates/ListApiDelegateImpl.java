package dev.jadnb.shoppinglist.web.delegates;

import dev.jadnb.shoppinglist.api.ListApiDelegate;
import dev.jadnb.shoppinglist.model.ShoppingList;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ListApiDelegateImpl implements ListApiDelegate {

    @Override
    public ResponseEntity<List<ShoppingList>> listGet() {
        return ListApiDelegate.super.listGet();
    }

    @Override
    public ResponseEntity<Void> listIdDelete(String id) {
        return ListApiDelegate.super.listIdDelete(id);
    }

    @Override
    public ResponseEntity<ShoppingList> listIdGet(String id) {
        return ListApiDelegate.super.listIdGet(id);
    }

    @Override
    public ResponseEntity<ShoppingList> listIdPut(String id, ShoppingList shoppingList) {
        return ListApiDelegate.super.listIdPut(id, shoppingList);
    }

    @Override
    public ResponseEntity<ShoppingList> listPost() {
        return ListApiDelegate.super.listPost();
    }
}
