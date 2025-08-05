package com.taobao.phenix.cache.disk;

import tb.kge;

/* loaded from: classes7.dex */
public class OnlyCacheFailedException extends Exception {
    static {
        kge.a(-397673867);
    }

    public OnlyCacheFailedException(String str) {
        super("No disk cache , " + str + " cannot conduct final result at OnlyCache()");
    }
}
