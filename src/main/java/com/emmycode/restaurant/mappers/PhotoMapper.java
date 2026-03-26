package com.emmycode.restaurant.mappers;

import com.emmycode.restaurant.domain.dtos.PhotoDto;
import com.emmycode.restaurant.domain.entities.Photo;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PhotoMapper {
    PhotoDto toDto(Photo photo);
}
