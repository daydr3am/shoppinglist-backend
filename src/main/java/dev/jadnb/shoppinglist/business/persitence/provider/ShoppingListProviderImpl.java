package dev.jadnb.shoppinglist.business.persitence.provider;

import dev.jadnb.shoppinglist.business.persitence.model.ShoppingListEntity;
import dev.jadnb.shoppinglist.business.persitence.respository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ShoppingListProviderImpl implements ShoppingListProvider {

    private final UserRepository userRepository;

    @Override
    public List<ShoppingListEntity> getAllShoppingListsForUser(final String userId) {
        return userRepository.findByUuid(userId).getShoppingLists();
    }
}
