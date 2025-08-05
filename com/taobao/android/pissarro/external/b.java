package com.taobao.android.pissarro.external;

import com.android.alibaba.ip.runtime.IpChange;
import tb.icb;
import tb.kge;

/* loaded from: classes6.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private icb f14659a;

    /* loaded from: classes6.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static b f14660a;

        static {
            kge.a(1198716375);
            f14660a = new b();
        }
    }

    static {
        kge.a(-1904356092);
    }

    private b() {
    }

    public static b a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("60b0afca", new Object[0]) : a.f14660a;
    }

    public icb b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (icb) ipChange.ipc$dispatch("16b784f5", new Object[]{this}) : this.f14659a;
    }
}
