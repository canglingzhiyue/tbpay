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
import tb.ilz;
import tb.imi;

/* loaded from: classes6.dex */
public class h implements c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ilz f14890a;
    private final Context b;
    private final d d;
    private final e e;
    private b c = null;
    private final Map<String, imi> f = new HashMap();
    private final Map<String, String> g = new ConcurrentHashMap();

    public h(Context context, ilz ilzVar, final i iVar) {
        this.b = context;
        this.f14890a = ilzVar;
        a.C0568a.helper.a(context);
        a.C0568a.helper.a(new a.b() { // from class: com.taobao.android.revisionswitch.core.h.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.revisionswitch.utils.a.b
            public void a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    iVar.a(h.this);
                }
            }
        });
        this.d = new d(this.f14890a, a.C0568a.helper);
        this.e = new e(this.f14890a, a.C0568a.helper);
        g();
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        Map<String, ?> d = this.f14890a.d();
        for (String str : d.keySet()) {
            Object obj = d.get(str);
            if (obj instanceof String) {
                this.g.put(str, (String) obj);
            }
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
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

    @Override // com.taobao.android.revisionswitch.core.c
    public e c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("707ad8d9", new Object[]{this}) : this.e;
    }

    @Override // com.taobao.android.revisionswitch.core.c
    public boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : this.d.a("location");
    }

    @Override // com.taobao.android.revisionswitch.core.c
    public String a() {
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        if (!TBRevisionSwitchManager.i().d()) {
            i = 0;
        }
        if (TBRevisionSwitchManager.i().c()) {
            i |= 2;
        }
        return String.valueOf(i);
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

    public String b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str}) : this.f14890a.f(str);
    }

    public void a(Map<String, String> map, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d21c198c", new Object[]{this, map, new Boolean(z), new Integer(i)});
            return;
        }
        if (z) {
            this.f14890a.e();
        }
        Set<String> keySet = map.keySet();
        for (String str : keySet) {
            this.f14890a.d(str, map.get(str));
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

    public String c(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b82f346c", new Object[]{this, str}) : a(str, false);
    }

    public String a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d7b527fe", new Object[]{this, str, new Boolean(z)});
        }
        if (z) {
            String b = b(str);
            TLog.loge("SwitchManager", "getSwitch inDisk: key: " + str + "; value: " + b);
            return b;
        }
        String a2 = a(str);
        TLog.loge("SwitchManager", "getSwitch not inDisk: key: " + str + "; value: " + a2);
        return a2;
    }
}
