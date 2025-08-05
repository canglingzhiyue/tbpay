package com.alilive.adapter.uikit;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.png;

/* loaded from: classes3.dex */
public class f implements png {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f4326a;
    private int b;
    private int c;

    static {
        kge.a(-35995627);
        kge.a(-426609473);
    }

    public f(Context context, int i, int i2) {
        this.f4326a = context;
        this.b = i;
        this.c = i2;
    }

    public Context a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("75941360", new Object[]{this}) : this.f4326a;
    }

    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.b;
    }

    public int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.c;
    }
}
