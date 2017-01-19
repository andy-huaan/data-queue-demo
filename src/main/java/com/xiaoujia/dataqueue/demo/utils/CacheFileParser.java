package com.xiaoujia.dataqueue.demo.utils;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 缓存文件解析
 * Created by Andy
 * email zhaohuaan0925@163.com
 * created 2017/1/7 19:17
 */
public class CacheFileParser {

    public static void main(String[] args) throws IOException {
        String cacheFile = "D:/logs/data-queue/data.log";

        File cache = new File(cacheFile);
        if (cache.exists()) {
            if (cache.isFile() && cache.canRead() && cache.canWrite()) {
                RandomAccessFile marker = new RandomAccessFile(cache, "rw");
                System.out.println("缓存文件长度："+marker.length());
            } else {
                throw new IOException("缓存文件异常或无权读写");
            }
        } else {
            System.out.println("缓存文件不存在："+cacheFile);
        }
    }
}
