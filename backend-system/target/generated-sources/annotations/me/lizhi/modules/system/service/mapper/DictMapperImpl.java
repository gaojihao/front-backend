package me.lizhi.modules.system.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import me.lizhi.modules.system.domain.Dict;
import me.lizhi.modules.system.service.dto.DictDTO;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-05-29T23:42:02+0800",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_131 (Oracle Corporation)"
)
@Component
public class DictMapperImpl implements DictMapper {

    @Override
    public Dict toEntity(DictDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Dict dict = new Dict();

        dict.setId( dto.getId() );
        dict.setName( dto.getName() );
        dict.setRemark( dto.getRemark() );

        return dict;
    }

    @Override
    public DictDTO toDto(Dict entity) {
        if ( entity == null ) {
            return null;
        }

        DictDTO dictDTO = new DictDTO();

        dictDTO.setId( entity.getId() );
        dictDTO.setName( entity.getName() );
        dictDTO.setRemark( entity.getRemark() );

        return dictDTO;
    }

    @Override
    public List<Dict> toEntity(List<DictDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Dict> list = new ArrayList<Dict>( dtoList.size() );
        for ( DictDTO dictDTO : dtoList ) {
            list.add( toEntity( dictDTO ) );
        }

        return list;
    }

    @Override
    public List<DictDTO> toDto(List<Dict> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<DictDTO> list = new ArrayList<DictDTO>( entityList.size() );
        for ( Dict dict : entityList ) {
            list.add( toDto( dict ) );
        }

        return list;
    }
}
