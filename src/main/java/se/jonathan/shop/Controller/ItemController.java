package se.jonathan.shop.Controller; // Matchar mappen "Controller"

import org.springframework.web.bind.annotation.*;
import se.jonathan.shop.Entity.Item;           // Import av Item
import se.jonathan.shop.Repository.ItemRepository; // Import av Repository

import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemController {

    private final ItemRepository itemRepository;

    public ItemController(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @PostMapping
    public Item createItem(@RequestBody Item item) {
        return itemRepository.save(item);
    }

    @GetMapping
    public List<Item> getItems() {
        return itemRepository.findAll();
    }
}