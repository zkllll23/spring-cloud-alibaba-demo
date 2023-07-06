package net.biancheng.c.service;

import net.biancheng.c.entity.CommonResult;
import net.biancheng.c.entity.Dept;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DeptFallbackService implements DeptFeignService {

    @Override
    public CommonResult<Dept> get(int id) {
        return null;
    }

    @Override
    public CommonResult<List<Dept>> list() {
        return null;
    }
}
