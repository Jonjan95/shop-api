package se.jonathan.shop;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional; // 1. Import
import se.jonathan.shop.Entity.Item;
import se.jonathan.shop.Repository.ItemRepository;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional // 2. Denna ser till att datan raderas efter testet
class ShopApplicationTests {

    @Autowired
    private ItemRepository itemRepository;

    @Test
    void testCreateAndFindItem() {
        Item newItem = new Item("Test-Dator", 15000.0);

        Item savedItem = itemRepository.save(newItem);

        assertNotNull(savedItem.getId());
        assertEquals("Test-Dator", savedItem.getName());
    }
}