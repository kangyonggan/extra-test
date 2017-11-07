package com.kangyonggan.extra;

import com.kangyonggan.extra.handle.ValidHandle;

/**
 * @author kangyonggan
 * @since 11/7/17
 */
public class Log4j2ValidHandle implements ValidHandle {

    @Override
    public void failure(RuntimeException e) {
        System.err.println("参数校验异常:" + e);
    }
}
