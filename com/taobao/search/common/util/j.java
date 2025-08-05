package com.taobao.search.common.util;

import com.android.alibaba.ip.runtime.IpChange;
import tb.imn;
import tb.kge;

/* loaded from: classes7.dex */
public final class j {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final j INSTANCE;

    static {
        kge.a(-1936984542);
        INSTANCE = new j();
    }

    private j() {
    }

    public final boolean a(imn imnVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("edf4cad2", new Object[]{this, imnVar})).booleanValue() : com.taobao.android.searchbaseframe.chitu.c.b("elderHome", imnVar);
    }

    public final boolean b(imn imnVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("dc77d153", new Object[]{this, imnVar})).booleanValue() : com.taobao.android.searchbaseframe.chitu.c.b("searchGrayHair", imnVar);
    }

    public final boolean c(imn imnVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cafad7d4", new Object[]{this, imnVar})).booleanValue() : com.taobao.android.searchbaseframe.chitu.c.b("srpFullTraceEnable", imnVar);
    }

    public final boolean d(imn imnVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b97dde55", new Object[]{this, imnVar})).booleanValue() : com.taobao.android.searchbaseframe.chitu.c.b("shopElderEnable", imnVar);
    }

    public final boolean e(imn imnVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a800e4d6", new Object[]{this, imnVar})).booleanValue() : com.taobao.android.searchbaseframe.chitu.c.b("XSearchDebugToast", imnVar);
    }
}
