package com.taobao.android.remoteso.tbadapter.ext;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.List;
import tb.ijd;
import tb.ikl;
import tb.iks;
import tb.ikw;

/* loaded from: classes6.dex */
public class b implements ijd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Application f14856a;

    @Override // tb.ijd
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        }
    }

    public b(Application application) {
        this.f14856a = application;
    }

    @Override // tb.ijd
    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue() : ikl.a(this.f14856a, "SwallowsRemoteSoSwitch", "key_lib_disabled_list2", str);
    }

    @Override // tb.ijd
    public boolean b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue() : ikl.a(this.f14856a, "SwallowsRemoteSoSwitch", "key_blacklist_on_demand_fetch_libs", str);
    }

    @Override // tb.ijd
    public boolean a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8123ece6", new Object[]{this, str, new Boolean(z)})).booleanValue() : ikw.a((CharSequence) str) ? z : ikl.a(this.f14856a, "SwallowsRemoteSoSwitch", str, z);
    }

    @Override // tb.ijd
    public long a(String str, long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8123b0c6", new Object[]{this, str, new Long(j)})).longValue() : ikw.a((CharSequence) str) ? j : ikl.a(this.f14856a, "SwallowsRemoteSoSwitch", str, j);
    }

    @Override // tb.ijd
    public String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4204a5c3", new Object[]{this, str, str2}) : ikw.a((CharSequence) str) ? str2 : ikl.b(this.f14856a, "SwallowsRemoteSoSwitch", str, str2);
    }

    @Override // tb.ijd
    public List<String> c(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("eb209513", new Object[]{this, str}) : a(str, "");
    }

    @Override // tb.ijd
    public List<String> a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("8c4a1d4b", new Object[]{this, str, str2});
        }
        if (ikw.a((CharSequence) str)) {
            return Collections.emptyList();
        }
        String b = ikl.b(this.f14856a, "SwallowsRemoteSoSwitch", str, str2);
        if (ikw.a((CharSequence) b)) {
            return Collections.emptyList();
        }
        return iks.a(b.split(","));
    }

    @Override // tb.ijd
    public String d(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f4d254b", new Object[]{this, str}) : c.a(this.f14856a, str);
    }
}
