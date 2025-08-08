package com.taobao.search.musie;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import android.util.LruCache;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.face.VExecutors;
import com.taobao.android.weex_framework.adapter.MUSImageQuality;
import com.taobao.android.weex_framework.adapter.d;
import com.taobao.downgrade.Downgrade;
import com.taobao.downgrade.DowngradeStrategy;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.tao.util.ImageStrategyDecider;
import com.taobao.tao.util.TaobaoImageUrlStrategy;
import java.lang.ref.SoftReference;
import java.util.concurrent.ExecutorService;
import tb.jxe;
import tb.kge;

/* loaded from: classes7.dex */
public class l implements com.taobao.android.weex_framework.adapter.d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;
    private static final Handler b;
    private static ImageStrategyConfig c;
    private static ImageStrategyConfig d;
    private static ImageStrategyConfig e;
    private static final f f;
    private static final LruCache<String, SoftReference<Drawable>> g;

    /* renamed from: a  reason: collision with root package name */
    private final ExecutorService f19256a;
    private boolean h;

    /* loaded from: classes7.dex */
    public static final class b implements com.taobao.android.virtual_thread.face.h {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final b INSTANCE = new b();

        @Override // com.taobao.android.virtual_thread.face.h
        public final String newThreadName() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("57dab4a4", new Object[]{this}) : "PerfImageAdapter";
        }
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public l() {
        ExecutorService newFixedThreadPool = VExecutors.newFixedThreadPool(6, b.INSTANCE);
        kotlin.jvm.internal.q.a((Object) newFixedThreadPool, "VExecutors.newFixedThrea…6) { \"PerfImageAdapter\" }");
        this.f19256a = newFixedThreadPool;
        DowngradeStrategy downgradeStrategy = Downgrade.getInstance().getDowngradeStrategy("search");
        kotlin.jvm.internal.q.a((Object) downgradeStrategy, "downgradeStrategy");
        this.h = kotlin.jvm.internal.q.a((Object) "degrade", (Object) downgradeStrategy.getTacticsPerformance());
    }

    public static final /* synthetic */ Handler a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("b016d95e", new Object[0]) : b;
    }

    public static final /* synthetic */ void a(ImageStrategyConfig imageStrategyConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49ce285b", new Object[]{imageStrategyConfig});
        } else {
            c = imageStrategyConfig;
        }
    }

    public static final /* synthetic */ f b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("658b1e90", new Object[0]) : f;
    }

    public static final /* synthetic */ void b(ImageStrategyConfig imageStrategyConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf484e9c", new Object[]{imageStrategyConfig});
        } else {
            d = imageStrategyConfig;
        }
    }

    public static final /* synthetic */ ImageStrategyConfig c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageStrategyConfig) ipChange.ipc$dispatch("86389df", new Object[0]) : c;
    }

    public static final /* synthetic */ void c(ImageStrategyConfig imageStrategyConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34c274dd", new Object[]{imageStrategyConfig});
        } else {
            e = imageStrategyConfig;
        }
    }

    public static final /* synthetic */ ImageStrategyConfig d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageStrategyConfig) ipChange.ipc$dispatch("c1db177e", new Object[0]) : d;
    }

    public static final /* synthetic */ ImageStrategyConfig e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageStrategyConfig) ipChange.ipc$dispatch("7b52a51d", new Object[0]) : e;
    }

    public static final /* synthetic */ LruCache f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LruCache) ipChange.ipc$dispatch("a1c610de", new Object[0]) : g;
    }

    /* loaded from: classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1226659583);
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }

        public final Handler a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("b016d95e", new Object[]{this}) : l.a();
        }

        public final f b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("658b1e90", new Object[]{this}) : l.b();
        }

        public final LruCache<String, SoftReference<Drawable>> c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (LruCache) ipChange.ipc$dispatch("f5d2de9b", new Object[]{this}) : l.f();
        }

        public final String a(int i, int i2, String url, MUSImageQuality mUSImageQuality) {
            ImageStrategyConfig a2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("a3b4b2c4", new Object[]{this, new Integer(i), new Integer(i2), url, mUSImageQuality});
            }
            kotlin.jvm.internal.q.c(url, "url");
            return (mUSImageQuality == MUSImageQuality.ORIGINAL || (a2 = a(mUSImageQuality)) == null) ? url : ImageStrategyDecider.decideUrl(url, Integer.valueOf(i), Integer.valueOf(i2), a2);
        }

        public final ImageStrategyConfig a(MUSImageQuality mUSImageQuality) {
            int i;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ImageStrategyConfig) ipChange.ipc$dispatch("35240703", new Object[]{this, mUSImageQuality});
            }
            if (mUSImageQuality == null || (i = m.$EnumSwitchMapping$0[mUSImageQuality.ordinal()]) == 1 || i == 2) {
                if (l.c() == null) {
                    TaobaoImageUrlStrategy.ImageQuality imageQuality = TaobaoImageUrlStrategy.ImageQuality.q90;
                    l.a(n.$ipChange);
                }
                return l.c();
            } else if (i == 3) {
                if (l.d() == null) {
                    TaobaoImageUrlStrategy.ImageQuality imageQuality2 = TaobaoImageUrlStrategy.ImageQuality.q75;
                    l.b(n.$ipChange);
                }
                return l.d();
            } else {
                if (l.e() == null) {
                    TaobaoImageUrlStrategy.ImageQuality imageQuality3 = TaobaoImageUrlStrategy.ImageQuality.q50;
                    l.c(n.$ipChange);
                }
                return l.e();
            }
        }
    }

    static {
        kge.a(-2139561735);
        kge.a(1277892050);
        Companion = new a(null);
        b = new Handler(Looper.getMainLooper());
        f = new f();
        g = new LruCache<>(4);
    }

    @Override // com.taobao.android.weex_framework.adapter.d
    public void a(Context context, String str, d.a aVar, MUSImageQuality mUSImageQuality) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6314fb9c", new Object[]{this, context, str, aVar, mUSImageQuality});
        } else {
            a(context, str, aVar, mUSImageQuality, false);
        }
    }

    @Override // com.taobao.android.weex_framework.adapter.d
    public void a(Drawable drawable, d.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("658e7eb0", new Object[]{this, drawable, aVar});
        } else if (a(aVar) && (drawable instanceof com.taobao.search.musie.b)) {
            f.a((com.taobao.search.musie.b) drawable);
        } else {
            if (!(drawable instanceof com.taobao.search.musie.b)) {
                drawable = null;
            }
            com.taobao.search.musie.b bVar = (com.taobao.search.musie.b) drawable;
            if (bVar == null) {
                return;
            }
            bVar.b();
        }
    }

    public final void b(Context context, String str, d.a aVar, MUSImageQuality mUSImageQuality) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50dd5ebb", new Object[]{this, context, str, aVar, mUSImageQuality});
        } else {
            a(context, str, aVar, mUSImageQuality, true);
        }
    }

    @Override // com.taobao.android.weex_framework.adapter.d
    public void a(String str, d.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b96a54a", new Object[]{this, str, aVar});
            return;
        }
        Object b2 = aVar != null ? aVar.b() : null;
        if (!(b2 instanceof u)) {
            b2 = null;
        }
        u uVar = (u) b2;
        if (uVar == null) {
            return;
        }
        uVar.c();
        uVar.a((String) null);
    }

    private final boolean a(d.a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a20aaa58", new Object[]{this, aVar})).booleanValue() : (aVar instanceof jxe) || ((aVar instanceof com.taobao.search.m3.j) && g());
    }

    private final void a(Context context, String str, d.a aVar, MUSImageQuality mUSImageQuality, boolean z) {
        String str2;
        com.taobao.search.musie.b a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff8b2ab8", new Object[]{this, context, str, aVar, mUSImageQuality, new Boolean(z)});
        } else if (StringUtils.isEmpty(str) || aVar == null) {
        } else {
            if (mUSImageQuality == null || (str2 = mUSImageQuality.toString()) == null) {
                str2 = "auto";
            }
            String str3 = str + 'q' + str2 + 'w' + aVar.c() + 'h' + aVar.d();
            String str4 = str + 'q' + str2 + 'w' + aVar.c();
            if (a(aVar) && (a2 = f.a(str3)) != null) {
                aVar.a((Drawable) a2);
                return;
            }
            if (str == null) {
                kotlin.jvm.internal.q.a();
            }
            u uVar = new u(str, aVar, mUSImageQuality, str3, str4, z, a(aVar));
            if (uVar.h()) {
                this.f19256a.execute(uVar);
                return;
            }
            if (!z) {
                SoftReference<Drawable> remove = g.remove(str4);
                Drawable drawable = remove != null ? remove.get() : null;
                if (drawable != null) {
                    aVar.a(drawable);
                    return;
                }
            }
            if (this.h && !z) {
                this.f19256a.execute(uVar);
            } else {
                uVar.run();
            }
        }
    }
}
