package com.bcorp_hw2.bcorp_hw2.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bcorp_hw2.bcorp_hw2.model.Resource;
import com.bcorp_hw2.bcorp_hw2.repository.ResourceRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ResourceServiceImpl implements ResourceService {

    private final ResourceRepository resourceRepository;

    @Override
    public Resource create(Resource resource) {
        return resourceRepository.save(resource);
    }

    @Override
    public String delete(Long id) {
        resourceRepository.deleteById(id);
        return "Resource deleted!";
    }

    @Override
    public List<Resource> list() {
        return resourceRepository.findAll();
    }

    @Override
    public Resource update(Long id, Resource resource) {
        Resource resourceInstance = resourceRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Resource id " + id + " not found !!!"));

        resourceInstance.setDomain(resource.getDomain());
        resourceInstance.setName(resource.getName());
        resourceInstance.setUrl(resource.getUrl());
        resourceInstance.setViewYear(resource.getViewYear());

        return resourceRepository.save(resourceInstance);
    }
}
