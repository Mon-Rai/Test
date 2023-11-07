package com.test1.Service.impl;

import com.test1.Entities.Fom;
import com.test1.Payload.FomDto;
import com.test1.Repository.FomRepository;
import com.test1.Service.FomService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FomServiceImpl implements FomService {

    private final FomRepository fomRepository;
    private final ModelMapper mapper;

    @Autowired
    public FomServiceImpl(FomRepository fomRepository, ModelMapper mapper) {
        this.fomRepository = fomRepository;
        this.mapper = mapper;
    }

    @Override
    public FomDto enterData(FomDto fomDto) {
        Fom fom = mapToEntity(fomDto);
        Fom savedFom = fomRepository.save(fom);
        return mapToDto(savedFom);
    }


    private Fom mapToEntity(FomDto fomDto){
        return mapper.map(fomDto, Fom.class);
    }

    private FomDto mapToDto(Fom fom){
        return mapper.map(fom, FomDto.class);
    }
}
