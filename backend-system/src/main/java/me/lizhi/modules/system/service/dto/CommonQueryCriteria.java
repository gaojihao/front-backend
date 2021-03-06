package me.lizhi.modules.system.service.dto;

import lombok.Data;
import me.lizhi.aop.limit.Query;

@Data
public class CommonQueryCriteria {

    @Query(type = Query.Type.INNER_LIKE)
    private String name;
}
