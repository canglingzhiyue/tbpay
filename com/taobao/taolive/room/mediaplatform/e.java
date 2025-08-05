package com.taobao.taolive.room.mediaplatform;

import android.app.Activity;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.utils.aa;
import com.taobao.taolive.room.utils.m;
import com.taobao.taolive.room.utils.v;
import com.taobao.tbliveinteractive.InteractiveComponent;
import com.taobao.tbliveinteractive.business.list.InteractiveShowInfo;
import java.util.Map;
import tb.kge;
import tb.pkm;

/* loaded from: classes8.dex */
public class e implements com.taobao.tbliveinteractive.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f21629a;
    private Context b;
    private pkm c;
    private com.taobao.alilive.aliliveframework.frame.a d;

    static {
        kge.a(2110164058);
        kge.a(782545871);
    }

    @Override // com.taobao.tbliveinteractive.a
    public void a(InteractiveComponent interactiveComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84243444", new Object[]{this, interactiveComponent});
        }
    }

    @Override // com.taobao.tbliveinteractive.a
    public void a(InteractiveComponent interactiveComponent, InteractiveShowInfo interactiveShowInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("767001c2", new Object[]{this, interactiveComponent, interactiveShowInfo});
        }
    }

    @Override // com.taobao.tbliveinteractive.a
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        }
    }

    @Override // com.taobao.tbliveinteractive.a
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        }
    }

    public e(String str, Context context, com.taobao.alilive.aliliveframework.frame.a aVar, pkm pkmVar) {
        this.b = context;
        this.f21629a = str;
        this.d = aVar;
        this.c = pkmVar;
    }

    @Override // com.taobao.tbliveinteractive.a
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            m.c(this.d);
        }
    }

    @Override // com.taobao.tbliveinteractive.a
    public void dl_() {
        pkm pkmVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("678ac5de", new Object[]{this});
        } else if (!aa.ce() || (pkmVar = this.c) == null) {
        } else {
            pkmVar.a("kH5ontainerInitBegin", String.valueOf(System.currentTimeMillis()));
        }
    }

    @Override // com.taobao.tbliveinteractive.a
    public void c() {
        pkm pkmVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        m.e(this.d);
        if (!aa.ce() || (pkmVar = this.c) == null) {
            return;
        }
        pkmVar.a("kH5ontainerInitFinish", String.valueOf(System.currentTimeMillis()));
    }

    @Override // com.taobao.tbliveinteractive.a
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            m.f(this.d);
        }
    }

    @Override // com.taobao.tbliveinteractive.a
    public void b() {
        pkm pkmVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        com.taobao.taolive.room.utils.a.a((Activity) this.b, "h5_live_start_load_url");
        m.g(this.d);
        if (!aa.ce() || (pkmVar = this.c) == null) {
            return;
        }
        pkmVar.a("kH5UrlStartLoad", String.valueOf(System.currentTimeMillis()));
    }

    @Override // com.taobao.tbliveinteractive.a
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        pkm pkmVar = this.c;
        if (pkmVar == null) {
            return;
        }
        pkmVar.l(this.f21629a);
    }

    @Override // com.taobao.tbliveinteractive.a
    public void a(InteractiveComponent interactiveComponent, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f37e16c1", new Object[]{this, interactiveComponent, map});
            return;
        }
        try {
            if (this.c == null) {
                return;
            }
            this.c.a(this.f21629a, map.get("name"), map.containsKey("time") ? Long.parseLong(map.get("time")) : 0L);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.taobao.tbliveinteractive.a
    public void b(InteractiveComponent interactiveComponent, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6a9ca02", new Object[]{this, interactiveComponent, map});
            return;
        }
        try {
            if (this.c == null) {
                return;
            }
            this.c.a(this.f21629a, map.get("name"), map.containsKey("index") ? v.b(map.get("index")) : -1, map.containsKey("isEnableMultiBatchRender") && v.a(map.get("isEnableMultiBatchRender"), false), map.get("priority"));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
