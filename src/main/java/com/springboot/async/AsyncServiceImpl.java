package com.springboot.async;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncServiceImpl implements AsyncService{
    @Override
    @Async
    public void generateReport() {
        System.out.println("报表线程名称："+"【"+Thread.currentThread().getName()+"】");
    }

    @Override
    @Async
    public void sout() {
        System.out.println("新建方法名称："+'【'+Thread.currentThread().getName()+']');
    }
}
