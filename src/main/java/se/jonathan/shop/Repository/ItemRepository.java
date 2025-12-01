package se.jonathan.shop.Repository; // Matchar mappen "Repository"

import org.springframework.data.jpa.repository.JpaRepository;
import se.jonathan.shop.Entity.Item; // Import behövs eftersom Item ligger i en annan mapp

public interface ItemRepository extends JpaRepository<Item, Long> {
}