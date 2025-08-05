package com.taobao.android.detail.core.event.params;

import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public boolean f9715a;
    public String b;
    public boolean c;
    public String d;
    public int e;
    public int f;

    static {
        kge.a(-27767001);
    }

    public b(String str, String str2, boolean z) {
        this(str, str2, z, true);
    }

    public b(String str, String str2, boolean z, boolean z2) {
        this.d = str;
        this.b = str2;
        this.f9715a = z;
        this.c = z2;
        emu.a("com.taobao.android.detail.core.event.params.DoFavParams");
    }
}
