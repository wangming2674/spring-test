package com.evan.imitate.util;

import com.evan.imitate.event.FileUploadEvent;
import com.evan.imitate.manage.ListenerManage;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @ClassName FileUtil
 * @Description
 * @Author EvanWang
 * @Version 1.0.0
 * @Date 2019/12/9 17:06
 */
//假设现在公司让你开发一个文件操作帮助类
//定义一个文件读写方法 读写某个文件 写到某个类里面去

//但是 有时候可能会需要记录文件读取进度条的需求
//有时候需要进度条 如何实现？
public class FileUtil {

    public static int READ_SIZE = 100;

    public static void fileWrite(InputStream is, OutputStream os) throws Exception {
        fileWrite(is, os, null);
    }

    public static void fileWrite(InputStream is, OutputStream os, FileListener fileListener) throws Exception {
        BufferedInputStream bis = new BufferedInputStream(is);
        BufferedOutputStream bos = new BufferedOutputStream(os);

        /**
         * 如果是网络请求最好不要用这个方法拿fileSize,因为这个方法会产生阻塞。最好传一个File对象进来。
         * 这里作为演示，就不去处理细节了。
         */

        //文件总大小
        int fileSize = is.available();
        //一共读取了多少
        int readSize = 0;
        byte[] readedBytes = new byte[READ_SIZE];

        //控制是否退出
        boolean exit = true;

        while (exit) {
            //文件小于第一次读的大小的时候
            if (fileSize < READ_SIZE) {
                byte[] fileBytes = new byte[fileSize];
                //将缓冲区中的数据写入到字节数组fileBytes中
                bis.read(fileBytes);
                //向文件写入fileBytes数组的内容
                bos.write(fileBytes);
                readSize = fileSize;
                exit = false;
                //当你是最后一次读的时候
            } else if (fileSize < readSize + READ_SIZE) {
                byte[] bytes = new byte[fileSize - readSize];
                readSize = fileSize;
                bis.read(bytes);
                bos.write(bytes);
                exit = false;
            } else {
                bis.read(readedBytes);
                readSize += READ_SIZE;
                bos.write(readedBytes);
            }

            ListenerManage.publishEvent(new FileUploadEvent(fileSize, readSize));
            if (fileListener != null) {
                fileListener.updateLoad(fileSize, readSize);
            }
        }
        bis.close();
        bos.close();
    }
}
