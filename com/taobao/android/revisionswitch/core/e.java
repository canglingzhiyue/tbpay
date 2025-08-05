package com.taobao.android.revisionswitch.core;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.ilw;
import tb.ilx;
import tb.ily;
import tb.ilz;

/* loaded from: classes.dex */
public class e implements ilw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ilx f14885a;
    private boolean c;
    private final ilz e;
    private final com.taobao.android.revisionswitch.utils.a f;
    private f b = new f();
    private Map<String, String> d = new HashMap();

    public e(ilz ilzVar, com.taobao.android.revisionswitch.utils.a aVar) {
        this.e = ilzVar;
        this.f = aVar;
    }

    @Override // tb.ilw
    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        f fVar = this.b;
        if (fVar == null) {
            return false;
        }
        if (fVar.equals(f.DefaultOrangeAllOpenSwitch) || !this.b.c(str)) {
            return true;
        }
        return this.b.b(str);
    }

    public f a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("fd8bbdba", new Object[]{this});
        }
        f fVar = this.b;
        return fVar != null ? fVar : f.DefaultOrangeAllOpenSwitch;
    }

    public Map<String, String> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[]{this}) : this.d;
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else if ("orange".equals(str)) {
            com.taobao.android.revisionswitch.utils.c<String> c = com.taobao.android.revisionswitch.utils.b.a(str2).c();
            for (String str3 : c.b()) {
                boolean a2 = c.a(str3);
                if (!a2) {
                    this.b.a(str3, a2);
                    z = true;
                }
            }
            if (!z) {
                return;
            }
            this.f.a();
        } else if (ily.KEY_SIMPLE_SWITCH_ORANGE.equals(str)) {
            this.d = com.taobao.android.revisionswitch.utils.b.b(str2);
            this.f.a();
        }
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        this.f14885a = new ilx(this.e);
        this.f14885a.a(new ilx.a() { // from class: com.taobao.android.revisionswitch.core.e.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ilx.a
            public void a(String str, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                } else {
                    e.this.a(str, str2);
                }
            }
        });
        this.f14885a.a(context);
        this.b = this.f14885a.a("orange");
        String b = this.f14885a.b(ily.KEY_SIMPLE_SWITCH_ORANGE);
        if (b != null) {
            this.d = com.taobao.android.revisionswitch.utils.b.b(b);
        }
        String b2 = this.f14885a.b(ily.KEY_NEW_DISCOVERY_ORANGE);
        if (b2 == null) {
            return;
        }
        this.c = b2.equals("true");
    }
}
