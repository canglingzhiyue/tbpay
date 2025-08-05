package com.taobao.phenix.cache.disk;

import tb.kge;

/* loaded from: classes7.dex */
public class CacheUnavailableException extends Exception {
    static {
        kge.a(-770117720);
    }

    public CacheUnavailableException(b bVar, String str) {
        super("disk cache=" + bVar + " open failed, url=" + str);
    }
}
