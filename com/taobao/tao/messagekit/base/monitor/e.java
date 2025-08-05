package com.taobao.tao.messagekit.base.monitor;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ERROR = 2000;
    public static final int SUCCESS = 1000;
    public int b;
    public int c;
    public String e;
    public long f;
    public String g;
    public int h;
    public int i;
    public String j;

    /* renamed from: a  reason: collision with root package name */
    public int f20763a = 1000;
    public int d = 100;

    static {
        kge.a(-390897323);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "msgid=" + this.e + " retCode=" + this.f20763a + " userid=" + this.j + " stepid=" + this.b + " subTraceType=" + this.d + " bizFlag=" + this.c;
    }
}
