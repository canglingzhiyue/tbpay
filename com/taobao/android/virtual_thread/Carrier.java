package com.taobao.android.virtual_thread;

import tb.kge;

/* loaded from: classes6.dex */
public class Carrier extends Thread {
    static {
        kge.a(-1255250406);
    }

    public Carrier(Runnable runnable, String str) {
        super(runnable, str);
    }
}
