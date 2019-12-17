package com.evan.imitate.test;

import com.evan.imitate.listener.FileUploadListener;
import com.evan.imitate.manage.ListenerManage;
import com.evan.imitate.util.FileListener;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import static com.evan.imitate.util.FileUtil.fileWrite;

/**
 * @ClassName FileReadTest
 * @Description
 * @Author EvanWang
 * @Version 1.0.0
 * @Date 2019/12/9 18:26
 */
public class FileReadTest {
    public static void main(String[] args) throws Exception {
        ListenerManage.addListener(new FileUploadListener());

        File file = new File("F:\\测试写出.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        //如果需要做进度条功能，再添加一个fileListener参数
        fileWrite(new FileInputStream(new File("F:\\明天要做的事.txt")), new FileOutputStream(file));
    }
}
