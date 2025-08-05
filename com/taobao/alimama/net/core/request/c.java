package com.taobao.alimama.net.core.request;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.utils.Global;
import mtopsdk.mtop.intf.Mtop;
import tb.kge;

/* loaded from: classes4.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final c f8440a;
    private a b;

    /* loaded from: classes4.dex */
    public interface a {
        Mtop a();
    }

    static {
        kge.a(586883139);
        f8440a = new c();
    }

    private c() {
    }

    public static c a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("391e8b8", new Object[0]) : f8440a;
    }

    public synchronized Mtop b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Mtop) ipChange.ipc$dispatch("844542e6", new Object[]{this});
        }
        Mtop mtop = null;
        if (this.b != null) {
            mtop = this.b.a();
        }
        if (mtop != null) {
            return mtop;
        }
        return Mtop.instance(Global.getApplication());
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edc8889b", new Object[]{this, aVar});
        } else {
            this.b = aVar;
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.b = null;
        }
    }
}
