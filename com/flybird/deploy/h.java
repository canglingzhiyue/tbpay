package com.flybird.deploy;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.concurrent.Callable;
import tb.bxl;
import tb.bxm;

/* loaded from: classes4.dex */
public final class h implements Callable<Object[]> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f7214a;
    public final /* synthetic */ bxl b;
    public final /* synthetic */ HashMap c;

    public h(Context context, bxl bxlVar, HashMap hashMap) {
        this.f7214a = context;
        this.b = bxlVar;
        this.c = hashMap;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.lang.Object[]] */
    @Override // java.util.concurrent.Callable
    public Object[] call() throws Exception {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("6d249ded", new Object[]{this}) : bxm.a(this.f7214a, this.b, this.c);
    }
}
