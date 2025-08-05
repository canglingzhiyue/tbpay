package com.taobao.taobao.scancode.gateway.util;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import tb.kge;

/* loaded from: classes8.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public final m f21262a;
    public final FragmentActivity b;
    public final Intent c;
    public final boolean d;

    static {
        kge.a(474266602);
    }

    public b(m mVar, FragmentActivity fragmentActivity, Intent intent, boolean z) {
        this.f21262a = mVar;
        this.b = fragmentActivity;
        this.c = intent;
        this.d = z;
    }
}
