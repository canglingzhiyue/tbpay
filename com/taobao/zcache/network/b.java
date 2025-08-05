package com.taobao.zcache.network;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.zcache.h;
import com.taobao.zcache.j;
import com.taobao.zcache.k;
import tb.kge;

/* loaded from: classes9.dex */
public class b implements h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f23654a;

    static {
        kge.a(-1206428621);
        kge.a(1927580676);
        f23654a = false;
        try {
            f23654a = true;
        } catch (NoClassDefFoundError unused) {
        }
    }

    @Override // com.taobao.zcache.h
    public j a(k kVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (j) ipChange.ipc$dispatch("193a083d", new Object[]{this, kVar}) : f23654a ? new a(kVar) : new e(kVar);
    }
}
