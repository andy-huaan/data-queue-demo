package com.xiaoujia.dataqueue.demo.utils;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 解析marker文件中的值
 * Created by Andy
 * email zhaohuaan0925@163.com
 * created 2017/1/6 17:21
 * data-queue自动写入marker文件中的内容类型为Long
 */
public class MarkerParser {

    public static void main(String[] args) throws IOException {
        String markerFile = "D:/logs/data-queue/data.log.marker";

        File markFile = new File(markerFile);
        if (markFile.exists()) {
            if (markFile.isFile() && markFile.canRead() && markFile.canWrite()) {
                RandomAccessFile marker = new RandomAccessFile(markFile, "rw");
                marker.seek(0);
                System.out.println("marker文件内容："+marker.readLong());
            } else {
                throw new IOException("marker文件异常或无权读写");
            }
        } else {
            System.out.println("marker文件不存在："+markerFile);
        }
    }
}
