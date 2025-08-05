package com.taobao.android.dinamicx_v4.loader;

import tb.kge;

/* loaded from: classes5.dex */
public class DXLoaderException extends RuntimeException {
    static {
        kge.a(-535863334);
    }

    public DXLoaderException(String str) {
        super("LoaderException: " + str);
    }

    public DXLoaderException(String str, Throwable th) {
        super("LoaderException: " + str, th);
    }
}
