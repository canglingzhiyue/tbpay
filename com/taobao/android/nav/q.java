package com.taobao.android.nav;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class q implements com.taobao.android.nav.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final q f14459a;

        static {
            kge.a(-1848407813);
            f14459a = new q();
        }

        public static /* synthetic */ q a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (q) ipChange.ipc$dispatch("a22fd44b", new Object[0]) : f14459a;
        }
    }

    static {
        kge.a(-1060673862);
        kge.a(1056913481);
    }

    @Override // com.taobao.android.nav.a
    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.android.nav.a
    public boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue();
        }
        return true;
    }

    public static q a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (q) ipChange.ipc$dispatch("a22fd44b", new Object[0]) : a.a();
    }
}
