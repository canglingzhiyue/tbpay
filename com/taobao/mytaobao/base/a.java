package com.taobao.mytaobao.base;

import java.util.concurrent.CountDownLatch;
import tb.kge;

/* loaded from: classes7.dex */
public abstract class a {
    public static final String TAG = "MtbPrefetcher";

    /* renamed from: a  reason: collision with root package name */
    public static int f18298a;
    public static int b;
    public static int c;
    public static int d;
    public volatile int e = f18298a;
    public CountDownLatch f = new CountDownLatch(1);

    static {
        kge.a(995419648);
        f18298a = 0;
        b = 1;
        c = 2;
        d = 3;
    }
}
