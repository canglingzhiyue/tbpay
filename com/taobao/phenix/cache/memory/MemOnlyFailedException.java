package com.taobao.phenix.cache.memory;

import tb.kge;

/* loaded from: classes7.dex */
public class MemOnlyFailedException extends Exception {
    static {
        kge.a(-1882867770);
    }

    public MemOnlyFailedException() {
        super("no memory cache , MemCache cannot conduct final result at memOnly=true");
    }
}
