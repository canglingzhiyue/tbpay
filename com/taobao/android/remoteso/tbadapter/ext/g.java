package com.taobao.android.remoteso.tbadapter.ext;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.List;
import tb.ijd;
import tb.iks;
import tb.ikw;
import tb.ikx;

/* loaded from: classes6.dex */
public class g implements ijd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ijd f14860a;
    private volatile boolean b;
    private volatile boolean c;

    public g(ijd ijdVar) {
        this.f14860a = ijdVar;
    }

    @Override // tb.ijd
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.f14860a.a();
        this.b = ikx.a("SwallowsRemoteSoSwitch");
        this.c = ikx.a("SwallowsRemoteSoIndex");
    }

    @Override // tb.ijd
    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        if (this.b) {
            if (!ikw.a((CharSequence) str)) {
                return ikx.b("SwallowsRemoteSoSwitch").getProperty("key_lib_disabled_list2", "").contains(str);
            }
            return false;
        }
        return this.f14860a.a(str);
    }

    @Override // tb.ijd
    public boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue();
        }
        if (this.b) {
            String property = ikx.b("SwallowsRemoteSoSwitch").getProperty("key_blacklist_on_demand_fetch_libs", Boolean.FALSE.toString());
            if (ikw.b((CharSequence) str)) {
                return property.contains(str);
            }
        }
        return this.f14860a.b(str);
    }

    @Override // tb.ijd
    public boolean a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8123ece6", new Object[]{this, str, new Boolean(z)})).booleanValue();
        }
        if (this.b) {
            return Boolean.parseBoolean(ikx.b("SwallowsRemoteSoSwitch").getProperty(str, String.valueOf(z)));
        }
        return this.f14860a.a(str, z);
    }

    @Override // tb.ijd
    public long a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123b0c6", new Object[]{this, str, new Long(j)})).longValue();
        }
        if (this.b) {
            return Long.parseLong(ikx.b("SwallowsRemoteSoSwitch").getProperty(str, String.valueOf(j)));
        }
        return this.f14860a.a(str, j);
    }

    @Override // tb.ijd
    public String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4204a5c3", new Object[]{this, str, str2});
        }
        if (this.b) {
            return ikx.b("SwallowsRemoteSoSwitch").getProperty(str, str2);
        }
        return this.f14860a.b(str, str2);
    }

    @Override // tb.ijd
    public List<String> c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("eb209513", new Object[]{this, str});
        }
        if (this.b) {
            String property = ikx.b("SwallowsRemoteSoSwitch").getProperty(str, "");
            return ikw.b((CharSequence) property) ? iks.a(property.split(",")) : Collections.emptyList();
        }
        return this.f14860a.c(str);
    }

    @Override // tb.ijd
    public List<String> a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("8c4a1d4b", new Object[]{this, str, str2});
        }
        if (this.b) {
            String property = ikx.b("SwallowsRemoteSoSwitch").getProperty(str, str2);
            return ikw.b((CharSequence) property) ? iks.a(property.split(",")) : Collections.emptyList();
        }
        return this.f14860a.a(str, str2);
    }

    @Override // tb.ijd
    public String d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4d254b", new Object[]{this, str});
        }
        if (this.c) {
            return ikx.c("SwallowsRemoteSoIndex");
        }
        return this.f14860a.d(str);
    }
}
