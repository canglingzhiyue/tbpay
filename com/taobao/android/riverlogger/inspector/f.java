package com.taobao.android.riverlogger.inspector;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f14915a;
    private long b;
    private String c;
    private String d;

    static {
        kge.a(-1760260163);
    }

    public f(String str, String str2, String str3) {
        this.f14915a = str;
        this.c = str2;
        this.d = str3 == null ? "page" : str3;
        this.b = InspectorNativeAgent.createSession(str, str2, str3);
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        long j = this.b;
        if (j == 0) {
            return;
        }
        InspectorNativeAgent.openSession(j, str);
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            a(null);
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        long j = this.b;
        if (j == 0) {
            return;
        }
        InspectorNativeAgent.closeSession(j, str);
        this.b = 0L;
    }

    public void finalize() throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35321a5", new Object[]{this});
            return;
        }
        a(null);
        super.finalize();
    }
}
