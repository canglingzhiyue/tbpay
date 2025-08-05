package com.taobao.live.home.widget.tab;

import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.live.home.widget.tab.d;
import tb.kge;

/* loaded from: classes7.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final d.InterfaceC0687d f17782a;
    private static final a b;

    /* loaded from: classes7.dex */
    private interface a {
    }

    static {
        kge.a(-1558080217);
        f17782a = new d.InterfaceC0687d() { // from class: com.taobao.live.home.widget.tab.f.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.live.home.widget.tab.d.InterfaceC0687d
            public d a() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("44e72d5a", new Object[]{this}) : new d(new e());
            }
        };
        b = Build.VERSION.SDK_INT >= 21 ? new c() : new b();
    }

    public static d a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("44e72d5a", new Object[0]) : f17782a.a();
    }

    /* loaded from: classes7.dex */
    public static class b implements a {
        static {
            kge.a(79785952);
            kge.a(-1878539153);
        }

        private b() {
        }
    }

    /* loaded from: classes7.dex */
    public static class c implements a {
        static {
            kge.a(-859069542);
            kge.a(-1878539153);
        }

        private c() {
        }
    }
}
