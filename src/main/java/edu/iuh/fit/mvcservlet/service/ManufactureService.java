package edu.iuh.fit.mvcservlet.service;

import edu.iuh.fit.mvcservlet.model.Manufacturer;
import edu.iuh.fit.mvcservlet.repositories.GeneralRepository;

import java.util.List;

public class ManufactureService {
    private GeneralRepository<Manufacturer,Long> repository;

    public ManufactureService(){
        repository = new GeneralRepository<>("Manufacturer");
    }

    public List<Manufacturer> findAll(){
       return repository.findAll();
    }
}
