package com.taobao.augecore.network;

import android.os.Handler;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class a implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private b f16406a;
    private boolean b;

    /* renamed from: com.taobao.augecore.network.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static class C0634a {

        /* renamed from: a  reason: collision with root package name */
        public static a f16407a = new a();
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("cae15864", new Object[0]) : C0634a.f16407a;
    }

    private a() {
        this.b = false;
        this.f16406a = new com.taobao.augecore.network.imp.a();
    }

    @Override // com.taobao.augecore.network.b
    public boolean a(c cVar, NetworkRequest networkRequest, Handler handler, Class cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c0e52acd", new Object[]{this, cVar, networkRequest, handler, cls})).booleanValue() : this.f16406a.a(cVar, networkRequest, handler, cls);
    }
}
