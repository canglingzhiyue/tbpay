package com.taobao.android.detail.core.event.params;

import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    public String f9718a;
    public boolean b;
    public String c;

    static {
        kge.a(2132440938);
    }

    public e(String str, boolean z) {
        this.b = z;
        this.f9718a = str;
        emu.a("com.taobao.android.detail.core.event.params.ManipulateFloatWeexFragmentParams");
    }

    public e(String str, boolean z, String str2) {
        this(str, z);
        this.c = str2;
    }
}
