package com.wondercare.center.api.mapper;

import com.wondercare.center.api.model.Center;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring") //Creates a Spring Bean automatically
public interface CenterMapper {
    CenterMapper INSTANCE = Mappers.getMapper( CenterMapper.class );
    Center toCenter(com.wondercare.center.data.entity.Center center);
}
