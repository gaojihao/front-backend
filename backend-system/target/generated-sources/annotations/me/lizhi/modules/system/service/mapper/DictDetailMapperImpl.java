package me.lizhi.modules.system.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import me.lizhi.modules.system.domain.DictDetail;
import me.lizhi.modules.system.service.dto.DictDetailDTO;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-05-29T23:42:02+0800",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_131 (Oracle Corporation)"
)
@Component
public class DictDetailMapperImpl implements DictDetailMapper {

    @Override
    public DictDetail toEntity(DictDetailDTO dto) {
        if ( dto == null ) {
            return null;
        }

        DictDetail dictDetail = new DictDetail();

        dictDetail.setId( dto.getId() );
        dictDetail.setLabel( dto.getLabel() );
        dictDetail.setValue( dto.getValue() );
        dictDetail.setSort( dto.getSort() );

        return dictDetail;
    }

    @Override
    public DictDetailDTO toDto(DictDetail entity) {
        if ( entity == null ) {
            return null;
        }

        DictDetailDTO dictDetailDTO = new DictDetailDTO();

        dictDetailDTO.setId( entity.getId() );
        dictDetailDTO.setLabel( entity.getLabel() );
        dictDetailDTO.setValue( entity.getValue() );
        dictDetailDTO.setSort( entity.getSort() );

        return dictDetailDTO;
    }

    @Override
    public List<DictDetail> toEntity(List<DictDetailDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<DictDetail> list = new ArrayList<DictDetail>( dtoList.size() );
        for ( DictDetailDTO dictDetailDTO : dtoList ) {
            list.add( toEntity( dictDetailDTO ) );
        }

        return list;
    }

    @Override
    public List<DictDetailDTO> toDto(List<DictDetail> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<DictDetailDTO> list = new ArrayList<DictDetailDTO>( entityList.size() );
        for ( DictDetail dictDetail : entityList ) {
            list.add( toDto( dictDetail ) );
        }

        return list;
    }
}
