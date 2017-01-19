package com.xiaoujia.dataqueue.demo;

import com.xiaoujia.dataqueue.core.DataQueueExecutor;
import com.xiaoujia.dataqueue.core.DataQueueListener;
import com.xiaoujia.dataqueue.demo.entity.AndyModel;

import java.io.IOException;
import java.util.List;

/**
 * 例一：main方法中直接调用数据队列处理程序
 * Created by Andy
 * email zhaohuaan0925@163.com
 * created 2017/1/6 13:02
 */
public class SimpleDemo {


    public static void main(String[] args) throws IOException {

        DataQueueExecutor<AndyModel> executor = new DataQueueExecutor<>(new DataQueueListener<AndyModel>(){
            int total = 0;
            @Override
            public void peeks(List<AndyModel> list) throws Exception {
                total += list.size();
                System.out.println("本次批量处理数据条数：" + list.size() + ",总数：" + total+"--"+list.get(0).toString());
            }
        },AndyModel.class,1000,"D:/logs/data-queue/data.log","GBK",1024*1024*1024*5);


        for (int i = 0; i < 2; i++) {
            executor.offer(new AndyModel(i,"andy_" + i));
        }
    }
}
