package com.taobao.live.ubee;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.live.ubee.core.d;
import tb.kge;

/* loaded from: classes7.dex */
public class Ubee {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private d f;

    /* loaded from: classes7.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final Ubee f17801a;

        static {
            kge.a(749462929);
            f17801a = new Ubee();
        }

        public static /* synthetic */ Ubee a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Ubee) ipChange.ipc$dispatch("402b367a", new Object[0]) : f17801a;
        }
    }

    static {
        kge.a(-946606977);
    }

    private Ubee() {
    }

    public static Ubee a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Ubee) ipChange.ipc$dispatch("402b367a", new Object[0]) : a.a();
    }

    public d c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("d9644675", new Object[]{this});
        }
        if (this.f == null) {
            this.f = new d();
        }
        return this.f;
    }
}
