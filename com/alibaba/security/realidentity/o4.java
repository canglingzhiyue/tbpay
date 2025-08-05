package com.alibaba.security.realidentity;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class o4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public n4 f3480a;

    /* loaded from: classes3.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final o4 f3481a = new o4();

        public static /* synthetic */ o4 a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (o4) ipChange.ipc$dispatch("3c85f653", new Object[0]) : f3481a;
        }
    }

    public static o4 b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (o4) ipChange.ipc$dispatch("43eb2b72", new Object[0]) : b.a();
    }

    public n4 a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (n4) ipChange.ipc$dispatch("3c85f292", new Object[]{this}) : this.f3480a;
    }

    public o4() {
    }

    public void a(n4 n4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a307d28c", new Object[]{this, n4Var});
        } else {
            this.f3480a = n4Var;
        }
    }
}
