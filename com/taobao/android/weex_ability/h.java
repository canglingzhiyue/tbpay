package com.taobao.android.weex_ability;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import android.util.Base64;
import android.util.LruCache;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.adapter.MUSImageQuality;
import com.taobao.android.weex_framework.adapter.d;
import com.taobao.android.weex_framework.util.o;
import com.taobao.phenix.animate.b;
import com.taobao.phenix.intf.PhenixCreator;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.search.musie.n;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.tao.util.ImageStrategyDecider;
import com.taobao.tao.util.TaobaoImageUrlStrategy;
import java.lang.ref.SoftReference;
import tb.esr;
import tb.kge;

/* loaded from: classes6.dex */
public class h implements com.taobao.android.weex_framework.adapter.d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final Handler b;
    private LruCache<String, SoftReference<Drawable>> c = new LruCache<>(50);
    private ImageStrategyConfig d;
    private ImageStrategyConfig e;
    private ImageStrategyConfig f;

    public static /* synthetic */ Bitmap a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bitmap) ipChange.ipc$dispatch("30dda510", new Object[]{str}) : b(str);
    }

    public static /* synthetic */ Handler a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("b016d95e", new Object[0]) : b;
    }

    public static /* synthetic */ LruCache a(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LruCache) ipChange.ipc$dispatch("ec7a1972", new Object[]{hVar}) : hVar.c;
    }

    public static /* synthetic */ String a(h hVar, int i, int i2, String str, MUSImageQuality mUSImageQuality) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8ca7ebdd", new Object[]{hVar, new Integer(i), new Integer(i2), str, mUSImageQuality}) : hVar.a(i, i2, str, mUSImageQuality);
    }

    static {
        kge.a(177130004);
        kge.a(1277892050);
        b = new Handler(Looper.getMainLooper());
    }

    private static Bitmap b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("a657cb51", new Object[]{str});
        }
        byte[] decode = Base64.decode(str, 0);
        return BitmapFactory.decodeByteArray(decode, 0, decode.length);
    }

    @Override // com.taobao.android.weex_framework.adapter.d
    public void a(Context context, String str, d.a aVar, MUSImageQuality mUSImageQuality) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6314fb9c", new Object[]{this, context, str, aVar, mUSImageQuality});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            String mUSImageQuality2 = mUSImageQuality == null ? "auto" : mUSImageQuality.toString();
            if (aVar != null) {
                str2 = "w" + aVar.c() + "h" + aVar.d();
            } else {
                str2 = "";
            }
            String str3 = str + "q" + mUSImageQuality2 + str2;
            SoftReference<Drawable> softReference = this.c.get(str3);
            Drawable drawable = null;
            if (softReference != null && (drawable = softReference.get()) == null) {
                this.c.remove(str3);
            }
            if (drawable == null) {
                AsyncTask.THREAD_POOL_EXECUTOR.execute(new a(str, aVar, mUSImageQuality, str3));
            } else {
                aVar.a(drawable);
            }
        }
    }

    private ImageStrategyConfig a(MUSImageQuality mUSImageQuality) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageStrategyConfig) ipChange.ipc$dispatch("35240703", new Object[]{this, mUSImageQuality});
        }
        if (mUSImageQuality == null || mUSImageQuality == MUSImageQuality.HIGH || mUSImageQuality == MUSImageQuality.AUTO) {
            if (this.d == null) {
                this.d = a(TaobaoImageUrlStrategy.ImageQuality.q90);
            }
            return this.d;
        } else if (mUSImageQuality == MUSImageQuality.NORMAL) {
            if (this.e == null) {
                this.e = a(TaobaoImageUrlStrategy.ImageQuality.q75);
            }
            return this.e;
        } else {
            if (this.f == null) {
                this.f = a(TaobaoImageUrlStrategy.ImageQuality.q50);
            }
            return this.f;
        }
    }

    private ImageStrategyConfig a(TaobaoImageUrlStrategy.ImageQuality imageQuality) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageStrategyConfig) ipChange.ipc$dispatch("5a652e36", new Object[]{this, imageQuality});
        }
        ImageStrategyConfig.a a2 = ImageStrategyConfig.a("muise", 8900);
        a2.a(imageQuality);
        return a2.a();
    }

    private String a(int i, int i2, String str, MUSImageQuality mUSImageQuality) {
        ImageStrategyConfig a2;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a3b4b2c4", new Object[]{this, new Integer(i), new Integer(i2), str, mUSImageQuality}) : (mUSImageQuality == MUSImageQuality.ORIGINAL || (a2 = a(mUSImageQuality)) == null) ? str : ImageStrategyDecider.decideUrl(str, Integer.valueOf(i), Integer.valueOf(i2), a2);
    }

    @Override // com.taobao.android.weex_framework.adapter.d
    public void a(Drawable drawable, d.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("658e7eb0", new Object[]{this, drawable, aVar});
        } else if (!(drawable instanceof b)) {
        } else {
            ((b) drawable).f();
        }
    }

    @Override // com.taobao.android.weex_framework.adapter.d
    public void a(String str, d.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b96a54a", new Object[]{this, str, aVar});
            return;
        }
        if (aVar.b() instanceof a) {
            a.a((a) aVar.b());
        }
        aVar.a((Object) null);
    }

    /* loaded from: classes6.dex */
    public final class a extends o {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private volatile boolean b;
        private String c;
        private MUSImageQuality d;
        private volatile d.a e;
        private volatile com.taobao.phenix.intf.c f;
        private final String g;

        static {
            kge.a(895703605);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public static /* synthetic */ void a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ae2e2d64", new Object[]{aVar});
            } else {
                aVar.e();
            }
        }

        public static /* synthetic */ d.a b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (d.a) ipChange.ipc$dispatch("e673ed6f", new Object[]{aVar}) : aVar.e;
        }

        public static /* synthetic */ boolean c(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bcf897a6", new Object[]{aVar})).booleanValue() : aVar.b;
        }

        public static /* synthetic */ String d(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9ca921ff", new Object[]{aVar}) : aVar.g;
        }

        private a(String str, d.a aVar, MUSImageQuality mUSImageQuality, String str2) {
            this.c = str;
            this.e = aVar;
            this.d = mUSImageQuality;
            this.g = str2;
            aVar.a(this);
        }

        private void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
                return;
            }
            int indexOf = this.c.indexOf(n.BASE_64);
            if (indexOf < 0) {
                return;
            }
            final Bitmap a2 = h.a(this.c.substring(indexOf + 7));
            if (this.b) {
                return;
            }
            h.a().post(new o() { // from class: com.taobao.android.weex_ability.h.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.weex_framework.util.o
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    d.a b = a.b(a.this);
                    if (b == null || a.c(a.this) || a.b(a.this).b() != a.this) {
                        return;
                    }
                    b.a((Drawable) new BitmapDrawable(a2));
                }
            });
        }

        private void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("596b2eb", new Object[]{this});
                return;
            }
            d.a aVar = this.e;
            if (this.b || aVar == null) {
                return;
            }
            PhenixCreator failListener = com.taobao.phenix.intf.b.h().a((aVar.c() <= 0 || aVar.d() <= 0) ? this.c : h.a(h.this, aVar.c(), aVar.d(), this.c, this.d)).releasableDrawable(true).scaleFromLarge(true).addLoaderExtra(esr.BUNDLE_BIZ_CODE, String.valueOf(8900)).preloadWithSmall(false).succListener(new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: com.taobao.android.weex_ability.h.a.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.phenix.intf.event.a
                public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
                }

                public boolean a(final SuccPhenixEvent succPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
                    }
                    h.a().post(new o() { // from class: com.taobao.android.weex_ability.h.a.3.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.android.weex_framework.util.o
                        public void a() {
                            d.a b;
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("56c6c68", new Object[]{this});
                            } else if (a.c(a.this) || (b = a.b(a.this)) == null || b.b() != a.this) {
                            } else {
                                if (!(succPhenixEvent.getDrawable() instanceof b)) {
                                    h.a(h.this).put(a.d(a.this), new SoftReference(succPhenixEvent.getDrawable()));
                                }
                                b.a((Drawable) succPhenixEvent.getDrawable());
                                if (!(succPhenixEvent.getDrawable() instanceof b)) {
                                    return;
                                }
                                ((b) succPhenixEvent.getDrawable()).b();
                            }
                        }
                    });
                    return true;
                }
            }).failListener(new com.taobao.phenix.intf.event.a<FailPhenixEvent>() { // from class: com.taobao.android.weex_ability.h.a.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.phenix.intf.event.a
                public /* synthetic */ boolean onHappen(FailPhenixEvent failPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, failPhenixEvent})).booleanValue() : a(failPhenixEvent);
                }

                public boolean a(FailPhenixEvent failPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("64c1ef50", new Object[]{this, failPhenixEvent})).booleanValue();
                    }
                    h.a().post(new o() { // from class: com.taobao.android.weex_ability.h.a.2.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.android.weex_framework.util.o
                        public void a() throws Exception {
                            d.a b;
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("56c6c68", new Object[]{this});
                            } else if (a.c(a.this) || (b = a.b(a.this)) == null || b.b() != a.this) {
                            } else {
                                b.a();
                            }
                        }
                    });
                    return true;
                }
            });
            if (aVar.c() > 0 && aVar.d() > 0) {
                failListener.limitSize(null, aVar.c(), aVar.d());
            }
            this.f = failListener.fetch();
        }

        @Override // com.taobao.android.weex_framework.util.o
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else if (this.b || this.e == null) {
            } else {
                if (this.c.startsWith(n.BASE_64_PREFIX)) {
                    c();
                } else {
                    d();
                }
            }
        }

        private void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            } else if (this.b) {
            } else {
                this.b = true;
                if (this.f != null) {
                    this.f.b();
                    this.f = null;
                }
                this.e = null;
            }
        }
    }
}
