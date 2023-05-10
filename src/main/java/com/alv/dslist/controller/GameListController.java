package com.alv.dslist.controller;

import com.alv.dslist.dto.GameDTO;
import com.alv.dslist.dto.GameListDTO;
import com.alv.dslist.dto.GameMinDTO;
import com.alv.dslist.entities.GameList;
import com.alv.dslist.services.GameListService;
import com.alv.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;


    @GetMapping
    public List<GameListDTO> findAll(){
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }

}