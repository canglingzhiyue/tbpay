package com.taobao.android.revisionswitch.core;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.revisionswitch.TBRevisionSwitchManager;
import com.taobao.android.revisionswitch.utils.a;
import com.taobao.tao.log.TLog;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import tb.ilw;
import tb.ilz;
import tb.ima;
import tb.imb;
import tb.imc;
import tb.imd;
import tb.ime;
import tb.imf;
import tb.img;
import tb.imh;
import tb.imi;

/* loaded from: classes.dex */
public class g implements c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ilz f14888a;
    private final Context b;
    private b c;
    private final d d;
    private final e e;
    private final Map<String, imi> f = new HashMap();
    private final Map<String, String> g = new ConcurrentHashMap();

    public g(Context context, ilz ilzVar, final i iVar) {
        this.c = null;
        this.b = context;
        this.f14888a = ilzVar;
        a.C0568a.helper.a(context);
        a.C0568a.helper.a(new a.b() { // from class: com.taobao.android.revisionswitch.core.g.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.revisionswitch.utils.a.b
            public void a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    iVar.a(g.this);
                }
            }
        });
        this.c = new b(this.f14888a, a.C0568a.helper);
        this.d = new d(this.f14888a, a.C0568a.helper);
        this.e = new e(this.f14888a, a.C0568a.helper);
        i();
        h();
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        Map<String, ?> d = this.f14888a.d();
        for (String str : d.keySet()) {
            Object obj = d.get(str);
            if (obj instanceof String) {
                this.g.put(str, (String) obj);
            }
        }
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        this.f.put(ilw.KEY_NEW_FACE_ENABLE, new imf(this));
        this.f.put(ilw.KEY_NEW_CONTENT_ENABLE, new imc(this));
        this.f.put("new2021UIEnable", new imb(this));
        this.f.put(ilw.KEY_SUBSCRIBE_ENABLE, new img(this));
        this.f.put(ilw.KEY_NEW_FACE_OVERSEAS_ENABLE, new ime(this));
        this.f.put(ilw.KEY_NEW_DISCOVERY_ENABLE, new imd(this));
        this.f.put(ilw.KEY_MAIN_ARCH_UPGRADE, new imh(this));
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        this.c.a(this.b);
        this.d.a(this.b);
        this.e.a(this.b);
    }

    @Override // com.taobao.android.revisionswitch.core.c
    public Context d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("f183c0e3", new Object[]{this}) : this.b;
    }

    @Override // com.taobao.android.revisionswitch.core.c
    public b b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("b7034add", new Object[]{this}) : this.c;
    }

    public d g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("56590f36", new Object[]{this}) : this.d;
    }

    @Override // com.taobao.android.revisionswitch.core.c
    public e c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("707ad8d9", new Object[]{this}) : this.e;
    }

    @Override // com.taobao.android.revisionswitch.core.c
    public boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : (!this.d.a("location") || this.c.b() == null || this.c.b().a() == null) ? false : true;
    }

    @Override // com.taobao.android.revisionswitch.core.c
    public String a() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        if (TBRevisionSwitchManager.i().d()) {
            i = 1;
        }
        if (this.c.b().c().a(ilw.KEY_NEW_FACE_ENABLE) && this.e.a().c().b(ilw.KEY_NEW_FACE_ENABLE, true)) {
            i |= 2;
        }
        return String.valueOf(i);
    }

    public boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue();
        }
        if (!this.f.containsKey(str)) {
            return new ima(this, str).a();
        }
        return this.f.get(str).a();
    }

    @Override // com.taobao.android.revisionswitch.core.c
    public String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        if (!this.g.containsKey(str)) {
            return null;
        }
        Map<String, String> b = this.e.b();
        if (b.containsKey(str)) {
            return b.get(str);
        }
        return this.g.get(str);
    }

    public String c(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b82f346c", new Object[]{this, str}) : this.f14888a.f(str);
    }

    public void a(Map<String, String> map, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d21c198c", new Object[]{this, map, new Boolean(z), new Integer(i)});
            return;
        }
        if (z) {
            this.f14888a.e();
        }
        Set<String> keySet = map.keySet();
        for (String str : keySet) {
            this.f14888a.d(str, map.get(str));
        }
        if (i == 0) {
            TLog.loge("SwitchManager", "save SimpleSwitchValue not notify !");
        } else if (i == 1) {
            TLog.loge("SwitchManager", "save SimpleSwitchValue immediately !");
            for (String str2 : keySet) {
                this.g.put(str2, map.get(str2));
            }
            a.C0568a.helper.b();
            a.C0568a.helper.c();
        } else if (i == 2) {
            TLog.loge("SwitchManager", "save SimpleSwitchValue background !");
            for (String str3 : keySet) {
                this.g.put(str3, map.get(str3));
            }
            a.C0568a.helper.a();
        }
    }
}
