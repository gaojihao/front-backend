package me.lizhi.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import me.lizhi.domain.Log;
import me.lizhi.service.dto.LogSmallDTO;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-05-29T23:41:53+0800",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_131 (Oracle Corporation)"
)
@Component
public class LogSmallMapperImpl implements LogSmallMapper {

    @Override
    public Log toEntity(LogSmallDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Log log = new Log();

        log.setDescription( dto.getDescription() );
        log.setRequestIp( dto.getRequestIp() );
        log.setTime( dto.getTime() );
        log.setCreateTime( dto.getCreateTime() );

        return log;
    }

    @Override
    public LogSmallDTO toDto(Log entity) {
        if ( entity == null ) {
            return null;
        }

        LogSmallDTO logSmallDTO = new LogSmallDTO();

        logSmallDTO.setDescription( entity.getDescription() );
        logSmallDTO.setRequestIp( entity.getRequestIp() );
        logSmallDTO.setTime( entity.getTime() );
        logSmallDTO.setCreateTime( entity.getCreateTime() );

        return logSmallDTO;
    }

    @Override
    public List<Log> toEntity(List<LogSmallDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Log> list = new ArrayList<Log>( dtoList.size() );
        for ( LogSmallDTO logSmallDTO : dtoList ) {
            list.add( toEntity( logSmallDTO ) );
        }

        return list;
    }

    @Override
    public List<LogSmallDTO> toDto(List<Log> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<LogSmallDTO> list = new ArrayList<LogSmallDTO>( entityList.size() );
        for ( Log log : entityList ) {
            list.add( toDto( log ) );
        }

        return list;
    }
}
