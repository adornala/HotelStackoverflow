package com.hotel.web.rest;

import com.hotel.entity.HotelCategories;
import com.hotel.web.HotelCategoryServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by dornala on 5/14/17.
 */

@RestController
public class HotelServiceImplResource {

    private final HotelCategoryServiceImpl hotelCategoriesServiceImpl;

    public HotelServiceImplResource(HotelCategoryServiceImpl hotelCategoriesServiceImpl) {
        this.hotelCategoriesServiceImpl = hotelCategoriesServiceImpl;
    }

    //Implement all rest calls
    @GetMapping("/getHotelsCategories")
    public ResponseEntity<List<HotelCategories>> getAllCategories(){
        List<HotelCategories> dataset =  hotelCategoriesServiceImpl.findAll();
        return new ResponseEntity(dataset, HttpStatus.OK);
    }

    @DeleteMapping("/deleteHC/{id}")
    public ResponseEntity<List<HotelCategories>> removeUser(@PathVariable Integer id) {
        hotelCategoriesServiceImpl.delete(id);
        List<HotelCategories> dataset =  hotelCategoriesServiceImpl.findAll();
        return new ResponseEntity(dataset, HttpStatus.OK);
    }
}
