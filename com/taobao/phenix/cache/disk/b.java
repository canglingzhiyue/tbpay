package com.taobao.phenix.cache.disk;

import android.content.Context;
import tb.njf;

/* loaded from: classes.dex */
public interface b {
    @Deprecated
    public static final int EXTREME_HIGH_PRIORITY = 51;
    @Deprecated
    public static final int HIGH_PRIORITY = 34;
    @Deprecated
    public static final int MEDIUM_PRIORITY = 17;

    njf a(String str, int i);

    void a();

    void a(int i);

    boolean a(Context context);

    boolean a(String str, int i, byte[] bArr, int i2, int i3);

    int[] a(String str);

    int b();

    long b(String str, int i);

    boolean c();
}
