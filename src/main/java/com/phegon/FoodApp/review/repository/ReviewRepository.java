package com.phegon.FoodApp.review.repository;

import com.phegon.FoodApp.review.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review,Long> {

    List<Review> findByMenuIdOrderByIdDesc(Long menuId);

    @Query("SELECT AVG(r.rating) FROM Review r WHERE r.menu.id = :menuId")
    Double calculateAverageRatingByMenuId(@Param("menuId") Long menuId);

    boolean existsByUserIdAndMenuIdAndOrderId(@Param("userId") Long userId,
    @Param("menuId") Long menuId,@Param("orderId") Long orderId);
}
