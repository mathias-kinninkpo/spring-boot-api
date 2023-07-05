package com.bcorp_hw2.bcorp_hw2.service;

import java.util.List;

import com.bcorp_hw2.bcorp_hw2.model.Resource;

public interface ResourceService {

    Resource create(Resource resource);

    List<Resource> list();

    Resource update(Long id, Resource resource);

    String delete(Long id);

}
