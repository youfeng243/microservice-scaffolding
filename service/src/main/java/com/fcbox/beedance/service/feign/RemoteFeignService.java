package com.fcbox.beedance.service.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

@Component
@FeignClient(
        value = "service-log",
        fallback = OperationLogFeignServiceHystrix.class
)
public interface RemoteFeignService {
}
