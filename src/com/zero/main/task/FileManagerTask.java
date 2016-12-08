package com.zero.main.task;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by dell on 2016/12/7.
 * 定时任务类
 */
@Component
public class FileManagerTask {

    public void execute() {

        System.out.println("springmvc task execute ...");
    }
}
