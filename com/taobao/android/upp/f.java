package com.taobao.android.upp;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.aa;

/* loaded from: classes6.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final e f15796a = (e) aa.a(e.class, "com.taobao.android.upp.UppProtocolImpl");

        public static /* synthetic */ e a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("aef26585", new Object[0]) : f15796a;
        }
    }

    public static e a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("aef26585", new Object[0]) : a.a();
    }
}
