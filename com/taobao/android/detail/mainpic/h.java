package com.taobao.android.detail.mainpic;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.etz;
import tb.eub;

/* loaded from: classes4.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final etz j = new etz() { // from class: com.taobao.android.detail.mainpic.h.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.etz
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            }
        }
    };
    private static final eub k = new eub() { // from class: com.taobao.android.detail.mainpic.h.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.eub
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            }
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public boolean f10158a;
    public boolean b;
    public boolean c;
    public com.alibaba.android.ultron.event.base.d d;
    public String e;
    private String h;
    private List<String> i;
    private boolean n;
    private etz l = j;
    private eub m = k;
    public Map<String, com.alibaba.android.ultron.event.base.d> f = new HashMap();
    public Map<String, com.alibaba.android.ultron.event.base.d> g = new HashMap();

    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        if (this.i != null && !TextUtils.isEmpty(str)) {
            return this.i.contains(str);
        }
        return false;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.f10158a;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.f10158a = z;
        }
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.b;
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.c;
    }

    public com.alibaba.android.ultron.event.base.d d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.android.ultron.event.base.d) ipChange.ipc$dispatch("423d3e27", new Object[]{this}) : this.d;
    }

    public void a(com.alibaba.android.ultron.event.base.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93d8c0a4", new Object[]{this, dVar});
        } else {
            this.d = dVar;
        }
    }

    public void a(String str, com.alibaba.android.ultron.event.base.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38e1ac1a", new Object[]{this, str, dVar});
        } else if (str == null || dVar == null) {
        } else {
            this.f.put(str, dVar);
        }
    }

    public Map<String, com.alibaba.android.ultron.event.base.d> e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("d6be2fa1", new Object[]{this}) : this.f;
    }

    public String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : this.e;
    }

    public etz g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (etz) ipChange.ipc$dispatch("3d2e310d", new Object[]{this}) : this.l;
    }

    public void a(etz etzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e789814d", new Object[]{this, etzVar});
        } else {
            this.l = etzVar;
        }
    }

    public eub h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (eub) ipChange.ipc$dispatch("44dfd745", new Object[]{this}) : this.m;
    }

    public void a(eub eubVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e78cafe6", new Object[]{this, eubVar});
        } else {
            this.m = eubVar;
        }
    }

    public String i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e424ba30", new Object[]{this}) : TextUtils.isEmpty(this.h) ? "" : this.h;
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.h = str;
        }
    }

    public void a(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else {
            this.i = list;
        }
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue() : this.n;
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else {
            this.n = z;
        }
    }
}
