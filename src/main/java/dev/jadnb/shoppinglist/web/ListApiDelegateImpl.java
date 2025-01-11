package dev.jadnb.shoppinglist.web;

import dev.jadnb.shoppinglist.api.ListApiDelegate;
import dev.jadnb.shoppinglist.model.ShoppingList;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.List;
import java.util.Optional;

@Component
public class ListApiDelegateImpl implements ListApiDelegate {

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return ListApiDelegate.super.getRequest();
    }

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
