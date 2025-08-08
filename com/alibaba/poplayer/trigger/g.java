package com.alibaba.poplayer.trigger;

import mtopsdk.common.util.StringUtils;
import com.alibaba.poplayer.trigger.g;
import com.alibaba.poplayer.utils.f;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import tb.cag;
import tb.cai;
import tb.kge;

/* loaded from: classes3.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private static final ThreadPoolExecutor f3211a;
    private final String b;
    private final String c;
    private a d;
    private boolean e = false;
    private String f;

    /* loaded from: classes3.dex */
    public interface a {
        void a(String str);

        void a(String str, String str2, String str3);

        void a(String str, boolean z, boolean z2, String str2, String str3);
    }

    public static /* synthetic */ void lambda$BoZh_CMLO50_L0VUWiOJX_ntNmA(g gVar) {
        gVar.c();
    }

    public static /* synthetic */ void lambda$TzCqwWROxEdeGit1Ye2_HDhVFj8(g gVar) {
        gVar.d();
    }

    public static /* synthetic */ boolean a(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f2920d9", new Object[]{gVar})).booleanValue() : gVar.e;
    }

    public static /* synthetic */ boolean a(g gVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d5fbaca3", new Object[]{gVar, new Boolean(z)})).booleanValue();
        }
        gVar.e = z;
        return z;
    }

    public static /* synthetic */ a b(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("65752210", new Object[]{gVar}) : gVar.d;
    }

    public static /* synthetic */ ThreadPoolExecutor b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadPoolExecutor) ipChange.ipc$dispatch("c0e939c9", new Object[0]) : f3211a;
    }

    static {
        kge.a(855378771);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new f.a("TriggerCallBackThreadPool"));
        f3211a = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    private g(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    private static g b(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("674a1aa6", new Object[]{str, str2}) : new g(str, str2);
    }

    public static g a(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("e4ff65c7", new Object[]{str, str2}) : b(str, str2);
    }

    public g a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("9e865051", new Object[]{this, str});
        }
        this.f = str;
        return this;
    }

    public g a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("2b97740b", new Object[]{this, aVar});
        }
        this.d = aVar;
        return this;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (StringUtils.isEmpty(this.b) || !this.b.startsWith(cag.PAGE_SCHEME)) {
            if (this.d == null) {
                return;
            }
            f3211a.execute(new Runnable() { // from class: com.alibaba.poplayer.trigger.-$$Lambda$g$TzCqwWROxEdeGit1Ye2_HDhVFj8
                {
                    g.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    g.lambda$TzCqwWROxEdeGit1Ye2_HDhVFj8(g.this);
                }
            });
        } else {
            com.alibaba.poplayer.utils.f.a(new Runnable() { // from class: com.alibaba.poplayer.trigger.-$$Lambda$g$BoZh_CMLO50_L0VUWiOJX_ntNmA
                {
                    g.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    g.lambda$BoZh_CMLO50_L0VUWiOJX_ntNmA(g.this);
                }
            });
        }
    }

    public /* synthetic */ void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        a aVar = this.d;
        if (aVar == null) {
            return;
        }
        aVar.a("paramInvalid");
    }

    /* renamed from: com.alibaba.poplayer.trigger.g$1 */
    /* loaded from: classes3.dex */
    public class AnonymousClass1 implements cai {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ void lambda$NkRAckcu9hVGdJnidl55qCFbwkY(AnonymousClass1 anonymousClass1, String str) {
            anonymousClass1.b(str);
        }

        public static /* synthetic */ void lambda$bvdHDgIG59KF0gJINxd51dU6IzE(AnonymousClass1 anonymousClass1, String str, boolean z, boolean z2, String str2, String str3) {
            anonymousClass1.b(str, z, z2, str2, str3);
        }

        /* renamed from: lambda$eQ3ZppnQL6-GnAbhPq9kFEozlyg */
        public static /* synthetic */ void m247lambda$eQ3ZppnQL6GnAbhPq9kFEozlyg(AnonymousClass1 anonymousClass1, String str, String str2, String str3) {
            anonymousClass1.b(str, str2, str3);
        }

        @Override // tb.cai
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            }
        }

        public AnonymousClass1() {
            g.this = r1;
        }

        @Override // tb.cai
        public void a(final String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            } else if (g.a(g.this)) {
            } else {
                g.a(g.this, true);
                if (g.b(g.this) == null) {
                    return;
                }
                g.b().execute(new Runnable() { // from class: com.alibaba.poplayer.trigger.-$$Lambda$g$1$NkRAckcu9hVGdJnidl55qCFbwkY
                    {
                        g.AnonymousClass1.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        g.AnonymousClass1.lambda$NkRAckcu9hVGdJnidl55qCFbwkY(g.AnonymousClass1.this, str);
                    }
                });
            }
        }

        public /* synthetic */ void b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            } else if (g.b(g.this) == null) {
            } else {
                g.b(g.this).a(str);
            }
        }

        @Override // tb.cai
        public void a(final String str, final String str2, final String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
            } else if (g.b(g.this) == null) {
            } else {
                g.b().execute(new Runnable() { // from class: com.alibaba.poplayer.trigger.-$$Lambda$g$1$eQ3ZppnQL6-GnAbhPq9kFEozlyg
                    {
                        g.AnonymousClass1.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        g.AnonymousClass1.m247lambda$eQ3ZppnQL6GnAbhPq9kFEozlyg(g.AnonymousClass1.this, str, str2, str3);
                    }
                });
            }
        }

        public /* synthetic */ void b(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a3509d07", new Object[]{this, str, str2, str3});
            } else if (g.b(g.this) == null) {
            } else {
                g.b(g.this).a(str, str2, str3);
            }
        }

        @Override // tb.cai
        public void a(final String str, final boolean z, final boolean z2, final String str2, final String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e47be646", new Object[]{this, str, new Boolean(z), new Boolean(z2), str2, str3});
            } else if (g.a(g.this)) {
            } else {
                g.a(g.this, true);
                if (g.b(g.this) == null) {
                    return;
                }
                g.b().execute(new Runnable() { // from class: com.alibaba.poplayer.trigger.-$$Lambda$g$1$bvdHDgIG59KF0gJINxd51dU6IzE
                    {
                        g.AnonymousClass1.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        g.AnonymousClass1.lambda$bvdHDgIG59KF0gJINxd51dU6IzE(g.AnonymousClass1.this, str, z, z2, str2, str3);
                    }
                });
            }
        }

        public /* synthetic */ void b(String str, boolean z, boolean z2, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9ef186c7", new Object[]{this, str, new Boolean(z), new Boolean(z2), str2, str3});
            } else if (g.b(g.this) == null) {
            } else {
                g.b(g.this).a(str, z, z2, str2, str3);
            }
        }
    }

    public /* synthetic */ void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            cag.i().a(this.b, this.c, this.f, new AnonymousClass1());
        }
    }
}
