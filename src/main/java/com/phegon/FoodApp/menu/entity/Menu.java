package com.phegon.FoodApp.menu.entity;

import com.phegon.FoodApp.category.entity.Category;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "menus")
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

    private BigDecimal price;

    private String imageUrl;

    @ManyToOne
    @JoinColumn(name="category_id")
    private Category category;

    @OneToMany(mappedBy = "menu",cascade = CascadeType.ALL)
    private List<OrderItems> orderItems;

    @OneToMany(mappedBy = "menu", cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Review> reviews;


}
