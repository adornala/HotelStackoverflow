package com.hotel.service;

import com.hotel.entity.HotelCategories;

import java.util.List;

/**
 * Created by dornala on 5/14/17.
 */
public interface HotelCategoriesService {
    HotelCategories create(HotelCategories hotelCategories);
    void delete(Integer id);
    HotelCategories update(HotelCategories hotelCategories);
    List<HotelCategories> findAll();
}
