package com.hotel.repository;

import com.hotel.entity.HotelCategories;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by dornala on 5/14/17.
 */
public interface HotelCategoriesRepository extends JpaRepository <HotelCategories, Integer> {
}
