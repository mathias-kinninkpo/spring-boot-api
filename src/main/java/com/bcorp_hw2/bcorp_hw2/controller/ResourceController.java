package com.bcorp_hw2.bcorp_hw2.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bcorp_hw2.bcorp_hw2.model.Resource;
import com.bcorp_hw2.bcorp_hw2.service.ResourceService;

import lombok.AllArgsConstructor;
import java.util.List;

@RestController
@RequestMapping("/resource")
@AllArgsConstructor
public class ResourceController {

    private final ResourceService resourceService;

    @PostMapping("/create")
    public Resource create(@RequestBody Resource resource) {
        return resourceService.create(resource);
    }

    @GetMapping("/list")
    public List<Resource> list() {
        return resourceService.list();
    }

    @PutMapping("/update/{id}")
    public Resource update(@PathVariable Long id, @RequestBody Resource resource) {
        return resourceService.update(id, resource);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        return resourceService.delete(id);
    }

}
