package com.taobao.phenix.intf;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f18928a = "";
    public boolean b = false;
    private com.taobao.rxm.request.c c;

    static {
        kge.a(1436320776);
        kge.a(1674610169);
    }

    public c(com.taobao.rxm.request.c cVar) {
        this.c = cVar;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.f18928a = str;
        }
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.b;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.b = z;
        if (!z) {
            return;
        }
        this.c = null;
    }

    public boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue();
        }
        String str2 = this.f18928a;
        return str2 != null && str2.compareToIgnoreCase(str) == 0;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        com.taobao.rxm.request.c cVar = this.c;
        return cVar != null && !cVar.L();
    }

    public boolean b() {
        com.taobao.rxm.request.c cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        synchronized (this) {
            cVar = this.c;
            this.c = null;
        }
        if (cVar != null) {
            cVar.J();
        }
        return false;
    }
}
