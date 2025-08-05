package com.taobao.android.dinamicx.widget.refresh.layout.constant;

import tb.kge;

/* loaded from: classes5.dex */
public class b {
    public static final b FixedBehind;
    public static final b FixedFront;
    public static final b MatchLayout;
    public static final b Translate;

    /* renamed from: a  reason: collision with root package name */
    public final int f12182a;
    public final boolean b;
    public final boolean c;

    static {
        kge.a(-1684132194);
        Translate = new b(0, true, false);
        FixedBehind = new b(2, false, false);
        FixedFront = new b(3, true, false);
        MatchLayout = new b(4, true, false);
    }

    public b(int i, boolean z, boolean z2) {
        this.f12182a = i;
        this.b = z;
        this.c = z2;
    }
}
