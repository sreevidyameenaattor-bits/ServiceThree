package com.scalable.servicethree.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.scalable.servicethree.model.ServiceThreeModel;
@Repository
public interface ServiceThreeRepository  extends CrudRepository<ServiceThreeModel, Integer>   {

}
