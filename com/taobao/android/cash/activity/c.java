package com.taobao.android.cash.activity;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.weex.common.OnWXScrollListener;
import com.taobao.weex.utils.WXLogUtils;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicInteger;
import tb.kge;

/* loaded from: classes4.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Object f9310a;
    private static volatile AtomicInteger b;

    public static /* synthetic */ Object a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("bd3407ca", new Object[0]) : f9310a;
    }

    public static /* synthetic */ Class b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("6a1d2296", new Object[0]) : d();
    }

    public static /* synthetic */ AtomicInteger c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicInteger) ipChange.ipc$dispatch("df4eb9d4", new Object[0]) : b;
    }

    static {
        kge.a(-1127991761);
        b = new AtomicInteger();
    }

    private static Class d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("834f0d98", new Object[0]);
        }
        try {
            return Class.forName("com.alibaba.wireless.security.open.securitybodysdk.ISecurityBodyPageTrack");
        } catch (Exception unused) {
            WXLogUtils.e("WXSecurityGuardPageTrack", "[PageTrackLog]getPageTrackClass error");
            return null;
        }
    }

    /* loaded from: classes4.dex */
    public static class a implements OnWXScrollListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f9311a = 0;
        public int b = 0;
        public int c = 0;
        public int d = 0;
        public String e;
        public Context f;

        static {
            kge.a(1365163945);
            kge.a(931919082);
        }

        public static /* synthetic */ void a(a aVar, Object obj, String str, int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("761a0554", new Object[]{aVar, obj, str, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            } else {
                aVar.a(obj, str, i, i2, i3, i4);
            }
        }

        public a(String str, Context context) {
            this.e = null;
            this.f = null;
            this.e = str;
            this.f = context;
        }

        private void a(Object obj, String str, int i, int i2, int i3, int i4) {
            Class b = c.b();
            if (b != null) {
                try {
                    Method method = b.getMethod("addScrollEvent", String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE);
                    if (method == null) {
                        return;
                    }
                    method.invoke(obj, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
                } catch (Exception unused) {
                    WXLogUtils.e("WXSecurityGuardPageTrack", "[PageTrackLog]addScrollEventReflection error");
                }
            }
        }

        @Override // com.taobao.weex.common.OnWXScrollListener
        public void onScrolled(View view, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f253d1c0", new Object[]{this, view, new Integer(i), new Integer(i2)});
                return;
            }
            this.f9311a += i;
            this.b += i2;
        }

        @Override // com.taobao.weex.common.OnWXScrollListener
        public void onScrollStateChanged(View view, int i, int i2, final int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b177cda7", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3)});
            } else if (c.c().get() > 200) {
            } else {
                Coordinator.execute(new Runnable() { // from class: com.taobao.android.cash.activity.c.a.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        int i4 = i3;
                        if (i4 == 1) {
                            a.this.c = i4;
                        }
                        if (i3 == 0 && a.this.c == 1) {
                            try {
                                if (c.a() != null) {
                                    int i5 = a.this.d;
                                    int i6 = a.this.f9311a + 0;
                                    int i7 = a.this.b + i5;
                                    a.a(a.this, c.a(), a.this.e, i6, i7, 0, i5);
                                    a.this.d = i7;
                                    a.this.f9311a = 0;
                                    a.this.b = 0;
                                    a.this.c = i3;
                                }
                            } catch (Exception unused) {
                                WXLogUtils.e("WXSecurityGuardPageTrack", "[PageTrackLog]onScrollStateChanged error");
                            }
                        }
                        c.c().getAndDecrement();
                    }
                });
                c.c().getAndIncrement();
            }
        }
    }
}
