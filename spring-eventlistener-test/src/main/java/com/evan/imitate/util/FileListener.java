package com.evan.imitate.util;

/**
 * @ClassName FileListener
 * @Description
 * @Author EvanWang
 * @Version 1.0.0
 * @Date 2019/12/9 19:10
 */
public interface FileListener {
    void updateLoad(int fileSize, int readSize);
}
