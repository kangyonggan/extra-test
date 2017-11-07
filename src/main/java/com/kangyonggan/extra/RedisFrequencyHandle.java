package com.kangyonggan.extra;

import com.kangyonggan.extra.handle.FrequencyHandle;

/**
 * @author kangyonggan
 * @since 11/6/17
 */
public class RedisFrequencyHandle implements FrequencyHandle {

    @Override
    public void limit(String key, long interval, boolean interrupt) {
    }

}
