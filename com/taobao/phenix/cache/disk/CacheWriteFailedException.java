package com.taobao.phenix.cache.disk;

import tb.kge;

/* loaded from: classes7.dex */
public class CacheWriteFailedException extends Exception {
    static {
        kge.a(-1635773316);
    }

    public CacheWriteFailedException(b bVar, String str) {
        super("disk cache=" + bVar + " write failed, url=" + str);
    }
}
