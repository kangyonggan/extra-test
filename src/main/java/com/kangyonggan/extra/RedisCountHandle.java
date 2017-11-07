package com.kangyonggan.extra;

import com.kangyonggan.extra.handle.CountHandle;

/**
 * @author kangyonggan
 * @since 11/6/17
 */
public class RedisCountHandle implements CountHandle {

    @Override
    public void limit(String key, long interval, int count, boolean interrupt) {
    }

}
