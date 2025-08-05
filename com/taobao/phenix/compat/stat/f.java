package com.taobao.phenix.compat.stat;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.compat.k;
import java.util.Map;
import tb.njg;
import tb.njh;

/* loaded from: classes.dex */
public class f implements njg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final f f18922a = new f();

        public static /* synthetic */ f a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("d8cdcf0d", new Object[0]) : f18922a;
        }
    }

    public static f a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("d8cdcf0d", new Object[0]) : a.a();
    }

    @Override // tb.njg
    public void a(final String str, final String str2, final Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84162689", new Object[]{this, str, str2, map});
        } else {
            k.a(new Runnable() { // from class: com.taobao.phenix.compat.stat.f.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        njh.a().a(str, str2, map);
                    }
                }
            });
        }
    }

    @Override // tb.njg
    public void b(final String str, final String str2, final Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("854c7968", new Object[]{this, str, str2, map});
        } else {
            k.a(new Runnable() { // from class: com.taobao.phenix.compat.stat.f.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        njh.a().b(str, str2, map);
                    }
                }
            });
        }
    }

    @Override // tb.njg
    public void c(final String str, final String str2, final Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8682cc47", new Object[]{this, str, str2, map});
        } else {
            k.a(new Runnable() { // from class: com.taobao.phenix.compat.stat.f.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        njh.a().c(str, str2, map);
                    }
                }
            });
        }
    }

    @Override // tb.njg
    public void d(final String str, final String str2, final Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87b91f26", new Object[]{this, str, str2, map});
        } else {
            k.a(new Runnable() { // from class: com.taobao.phenix.compat.stat.f.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        njh.a().d(str, str2, map);
                    }
                }
            });
        }
    }
}
