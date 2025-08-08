package com.taobao.search.musie;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import android.util.LruCache;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.adapter.MUSImageQuality;
import com.taobao.android.weex_framework.adapter.d;
import com.taobao.phenix.intf.PhenixCreator;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import java.lang.ref.SoftReference;
import kotlin.TypeCastException;
import tb.esr;
import tb.kge;

/* loaded from: classes7.dex */
public final class u extends com.taobao.android.weex_framework.util.o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private volatile boolean f19283a;
    private volatile com.taobao.phenix.intf.c b;
    private final String c;
    private final d.a d;
    private final MUSImageQuality e;
    private final String f;
    private boolean g;
    private final String i;
    private final boolean j;
    private boolean k;

    /* loaded from: classes7.dex */
    public static final class a extends com.taobao.android.weex_framework.util.o {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Bitmap b;

        public a(Bitmap bitmap) {
            this.b = bitmap;
        }

        @Override // com.taobao.android.weex_framework.util.o
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            d.a d = u.this.d();
            if (u.a(u.this) || u.this.d().b() != u.this) {
                return;
            }
            d.a((Drawable) new BitmapDrawable(this.b));
        }
    }

    static {
        kge.a(-432662143);
    }

    public static /* synthetic */ Object ipc$super(u uVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* loaded from: classes7.dex */
    public static final class c<T extends com.taobao.phenix.intf.event.d> implements com.taobao.phenix.intf.event.a<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // com.taobao.phenix.intf.event.a
        public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
        }

        public final boolean a(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            if (u.a(u.this)) {
                return true;
            }
            Object b = u.this.d().b();
            u uVar = u.this;
            if (b != uVar) {
                return true;
            }
            if (uVar.j()) {
                LruCache<String, SoftReference<Drawable>> c = l.Companion.c();
                String i = u.this.i();
                kotlin.jvm.internal.q.a((Object) succPhenixEvent, "succPhenixEvent");
                c.put(i, new SoftReference<>(succPhenixEvent.getDrawable()));
            }
            kotlin.jvm.internal.q.a((Object) succPhenixEvent, "succPhenixEvent");
            if (succPhenixEvent.getDrawable() instanceof com.taobao.phenix.cache.memory.f) {
                BitmapDrawable drawable = succPhenixEvent.getDrawable();
                if (drawable != null) {
                    com.taobao.search.musie.b bVar = new com.taobao.search.musie.b((com.taobao.phenix.cache.memory.f) drawable, u.this.e());
                    u.this.d().a((Drawable) bVar);
                    if (u.this.k()) {
                        l.Companion.b().a(u.this.e(), bVar);
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.taobao.phenix.cache.memory.ReleasableBitmapDrawable");
                }
            } else {
                u.this.d().a((Drawable) succPhenixEvent.getDrawable());
                if (succPhenixEvent.getDrawable() instanceof com.taobao.phenix.animate.b) {
                    BitmapDrawable drawable2 = succPhenixEvent.getDrawable();
                    if (drawable2 == null) {
                        throw new TypeCastException("null cannot be cast to non-null type com.taobao.phenix.animate.AnimatedImageDrawable");
                    }
                    ((com.taobao.phenix.animate.b) drawable2).b();
                }
            }
            return true;
        }
    }

    /* loaded from: classes7.dex */
    public static final class d<T extends com.taobao.phenix.intf.event.d> implements com.taobao.phenix.intf.event.a<FailPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // com.taobao.phenix.intf.event.a
        public /* synthetic */ boolean onHappen(FailPhenixEvent failPhenixEvent) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d1090e38", new Object[]{this, failPhenixEvent})).booleanValue() : a(failPhenixEvent);
        }

        public final boolean a(FailPhenixEvent failPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("64c1ef50", new Object[]{this, failPhenixEvent})).booleanValue();
            }
            if (u.a(u.this)) {
                return true;
            }
            Object b = u.this.d().b();
            u uVar = u.this;
            if (b != uVar) {
                return true;
            }
            uVar.d().a();
            return true;
        }
    }

    public static final /* synthetic */ boolean a(u uVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a1135864", new Object[]{uVar})).booleanValue() : uVar.f19283a;
    }

    public final d.a d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d.a) ipChange.ipc$dispatch("8ecac7d7", new Object[]{this}) : this.d;
    }

    public final String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : this.f;
    }

    public final String i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e424ba30", new Object[]{this}) : this.i;
    }

    public final boolean j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue() : this.j;
    }

    public final boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue() : this.k;
    }

    public u(String url, d.a target, MUSImageQuality mUSImageQuality, String key, String cacheKey, boolean z, boolean z2) {
        kotlin.jvm.internal.q.c(url, "url");
        kotlin.jvm.internal.q.c(target, "target");
        kotlin.jvm.internal.q.c(key, "key");
        kotlin.jvm.internal.q.c(cacheKey, "cacheKey");
        this.c = url;
        this.d = target;
        this.e = mUSImageQuality;
        this.f = key;
        this.i = cacheKey;
        this.j = z;
        this.k = z2;
        this.d.a(this);
    }

    public final boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue();
        }
        this.g = kotlin.text.n.b(this.c, n.BASE_64_PREFIX, false, 2, (Object) null);
        return this.g;
    }

    private final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        int a2 = kotlin.text.n.a((CharSequence) this.c, n.BASE_64, 0, false, 6, (Object) null);
        if (a2 < 0) {
            return;
        }
        String str = this.c;
        int i = a2 + 7;
        if (str == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        String substring = str.substring(i);
        kotlin.jvm.internal.q.a((Object) substring, "(this as java.lang.String).substring(startIndex)");
        Bitmap a3 = n.a(substring);
        if (this.f19283a) {
            return;
        }
        l.Companion.a().post(new a(a3));
    }

    private final boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue();
        }
        if (str == null || !com.taobao.search.common.util.r.cm()) {
            return false;
        }
        String cn2 = com.taobao.search.common.util.r.cn();
        Uri uri = Uri.parse(str);
        kotlin.jvm.internal.q.a((Object) uri, "uri");
        return StringUtils.equals(uri.getHost(), cn2);
    }

    private final void g() {
        String str;
        PhenixCreator a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if (this.f19283a) {
        } else {
            if (this.d.c() > 0 && this.d.d() > 0) {
                str = l.Companion.a(this.d.c(), this.d.d(), this.c, this.e);
            } else {
                str = this.c;
            }
            com.taobao.phenix.intf.b h = com.taobao.phenix.intf.b.h();
            if (b(str)) {
                a2 = h.a(str, new b(str));
            } else {
                a2 = h.a(str);
            }
            PhenixCreator failListener = a2.releasableDrawable(true).scaleFromLarge(true).preloadWithSmall(false).addLoaderExtra(esr.BUNDLE_BIZ_CODE, String.valueOf(8900)).succListener(new c()).failListener(new d());
            if (this.d.c() > 0 && this.d.d() > 0) {
                d.a aVar = this.d;
                if (aVar instanceof com.taobao.search.musie.img.c) {
                    failListener.limitSize(null, ((com.taobao.search.musie.img.c) aVar).l(), ((com.taobao.search.musie.img.c) this.d).m());
                } else {
                    failListener.limitSize(null, aVar.c(), this.d.d());
                }
            }
            this.b = failListener.fetch();
        }
    }

    /* loaded from: classes7.dex */
    public static final class b extends com.taobao.phenix.cache.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;

        public b(String str) {
            this.b = str;
        }

        @Override // com.taobao.phenix.cache.a
        public String a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, str, str2});
            }
            String str3 = this.b;
            if (str3 == null) {
                kotlin.jvm.internal.q.a();
            }
            return str3;
        }

        @Override // com.taobao.phenix.cache.a
        public String b(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("4204a5c3", new Object[]{this, str, str2});
            }
            String str3 = this.b;
            if (str3 == null) {
                kotlin.jvm.internal.q.a();
            }
            return str3;
        }
    }

    @Override // com.taobao.android.weex_framework.util.o
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.f19283a || this.d == null) {
        } else {
            if (kotlin.text.n.b(this.c, n.BASE_64_PREFIX, false, 2, (Object) null)) {
                f();
            } else {
                g();
            }
        }
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.f19283a) {
        } else {
            this.f19283a = true;
            if (this.b == null) {
                return;
            }
            com.taobao.phenix.intf.c cVar = this.b;
            if (cVar == null) {
                kotlin.jvm.internal.q.a();
            }
            cVar.b();
            this.b = null;
        }
    }
}
