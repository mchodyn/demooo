package com.example.jaz3.service;

import com.example.jaz3.model.Part;

import java.util.List;

public interface PartService {
    public List<Part> retrieveParts();

    public Part getPart(Long partId);
    public void savePart(Part part);
    public void deletePart(Long partId);
    public void updatePart(Part part);
}
