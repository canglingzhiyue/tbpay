package com.taobao.android.behavir;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.aa;

/* loaded from: classes.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final com.taobao.android.behavir.a f9130a = (com.taobao.android.behavir.a) aa.a(com.taobao.android.behavir.a.class, "com.taobao.android.behavir.BehaviR");

        public static /* synthetic */ com.taobao.android.behavir.a a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (com.taobao.android.behavir.a) ipChange.ipc$dispatch("31d346db", new Object[0]) : f9130a;
        }
    }

    public static com.taobao.android.behavir.a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.behavir.a) ipChange.ipc$dispatch("31d346db", new Object[0]) : a.a();
    }
}
