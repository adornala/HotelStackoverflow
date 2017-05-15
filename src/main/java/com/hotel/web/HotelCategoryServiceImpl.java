package com.hotel.web;

import com.hotel.entity.HotelCategories;
import com.hotel.repository.HotelCategoriesRepository;
import com.hotel.service.HotelCategoriesService;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by dornala on 5/14/17.
 */
@Service
public class HotelCategoryServiceImpl implements HotelCategoriesService {

    private final HotelCategoriesRepository hotelCategoriesRepository;

    public HotelCategoryServiceImpl(HotelCategoriesRepository hotelCategoriesRepository ) {
        this.hotelCategoriesRepository = hotelCategoriesRepository;
    }

    @Override
    public HotelCategories create(HotelCategories hotelCategories) {
        return hotelCategoriesRepository.save(hotelCategories);
    }

    @Override
    public void delete(Integer id) {
        hotelCategoriesRepository.delete(id);
    }

    @Override
    public HotelCategories update(HotelCategories hotelCategories) {
        return hotelCategoriesRepository.save(hotelCategories);
    }

    @Override
    public List<HotelCategories> findAll() {
        return hotelCategoriesRepository.findAll();
    }
}
