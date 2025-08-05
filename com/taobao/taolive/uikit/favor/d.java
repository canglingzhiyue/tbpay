package com.taobao.taolive.uikit.favor;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.uikit.favor.c;
import tb.kge;

/* loaded from: classes8.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static d f22021a;
    private c c = new c();
    private Thread b = new Thread(this.c, "FavorRenderThread");

    static {
        kge.a(1242626700);
        f22021a = null;
    }

    public static d a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("28aca76b", new Object[0]);
        }
        if (f22021a == null) {
            f22021a = new d();
        }
        return f22021a;
    }

    private d() {
        b();
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.c.a();
        this.b.start();
    }

    public void a(c.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f5b1de9", new Object[]{this, aVar});
            return;
        }
        c cVar = this.c;
        if (cVar == null) {
            return;
        }
        cVar.a(aVar);
    }

    public void b(c.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bfb48ea", new Object[]{this, aVar});
            return;
        }
        c cVar = this.c;
        if (cVar == null) {
            return;
        }
        cVar.b(aVar);
    }
}
