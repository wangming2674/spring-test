package com.evan.imitate.listener;

import com.evan.imitate.event.FileUploadEvent;

/**
 * @ClassName FileUploadListener
 * @Description
 * @Author EvanWang
 * @Version 1.0.0
 * @Date 2019/12/9 21:38
 */
public class FileUploadListener implements ApplicationListener<FileUploadEvent> {
    @Override
    public void onEvent(FileUploadEvent fileUploadEvent) {
        double molecule = fileUploadEvent.getFileSize();
        double denominator = fileUploadEvent.getReadSize();
        System.out.println("当前文件上传进度百分比：" + (denominator / molecule * 100 + "%"));
    }
}
