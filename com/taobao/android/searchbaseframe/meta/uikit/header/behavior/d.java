package com.taobao.android.searchbaseframe.meta.uikit.header.behavior;

import tb.kge;

/* loaded from: classes6.dex */
public class d {
    public static final d FOLD;
    public static final d HALF_STICKY;
    public static final d LIST;
    public static final d LIST_HEADER;
    public static final d STICKY;

    /* renamed from: a  reason: collision with root package name */
    public final int f14988a;
    public final int b;
    public final int c;

    static {
        kge.a(-67164376);
        LIST_HEADER = new d(1000, 1000);
        LIST = new d(2000, 1000);
        FOLD = new d(1000, 1000);
        HALF_STICKY = new d(3000, 2000);
        STICKY = new d(1000, 3000);
    }

    public d(int i, int i2) {
        this(i, i, i2);
    }

    public d(int i, int i2, int i3) {
        this.f14988a = i3;
        this.b = i;
        this.c = i2;
    }
}
