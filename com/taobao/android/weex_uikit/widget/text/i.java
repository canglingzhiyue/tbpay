package com.taobao.android.weex_uikit.widget.text;

import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.text.TextPaint;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.o;
import com.taobao.android.weex_framework.widget.FontDO;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import tb.kge;

/* loaded from: classes6.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Handler f16220a;
    private final Map<String, WeakReference<Typeface>> b;

    /* loaded from: classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final i f16223a;

        static {
            kge.a(-2116345185);
            f16223a = new i();
        }

        public static /* synthetic */ i a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("4fd2579f", new Object[0]) : f16223a;
        }
    }

    static {
        kge.a(1515004721);
    }

    public static /* synthetic */ Typeface a(i iVar, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Typeface) ipChange.ipc$dispatch("5702cc1f", new Object[]{iVar, str}) : iVar.a(str);
    }

    public static /* synthetic */ void a(i iVar, String str, Typeface typeface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("745fc97d", new Object[]{iVar, str, typeface});
        } else {
            iVar.a(str, typeface);
        }
    }

    private i() {
        this.f16220a = new Handler(Looper.getMainLooper());
        this.b = new ConcurrentHashMap();
    }

    public static i a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("4fd2579f", new Object[0]) : a.a();
    }

    private Typeface a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Typeface) ipChange.ipc$dispatch("79ebd1a8", new Object[]{this, str});
        }
        WeakReference<Typeface> weakReference = this.b.get(str);
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    private void a(String str, Typeface typeface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae977514", new Object[]{this, str, typeface});
        } else {
            this.b.put(str, new WeakReference<>(typeface));
        }
    }

    public void a(final TextPaint textPaint, final String str, final int i, final int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27fbef12", new Object[]{this, textPaint, str, new Integer(i), new Integer(i2)});
        } else if (StringUtils.isEmpty(str)) {
            k.b(textPaint, i2, i, str);
        } else {
            Typeface typeface = textPaint.getTypeface();
            int style = typeface == null ? 0 : typeface.getStyle();
            final b bVar = new b();
            final String a2 = a(str, i, i2, style);
            Typeface a3 = a(a2);
            if (a3 != null) {
                b.a(bVar, a3);
            } else {
                FontDO a4 = com.taobao.android.weex_framework.widget.a.a().a(str);
                final boolean z = a4 == null || a4.c() != null;
                final CountDownLatch countDownLatch = new CountDownLatch(1);
                this.f16220a.post(new o() { // from class: com.taobao.android.weex_uikit.widget.text.i.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.weex_framework.util.o
                    public void a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                            return;
                        }
                        Typeface a5 = i.a(i.this, a2);
                        if (a5 == null && (a5 = k.a(textPaint, i, i2, str)) != null && z) {
                            i.a(i.this, a2, a5);
                        }
                        b.a(bVar, a5);
                        countDownLatch.countDown();
                    }

                    @Override // com.taobao.android.weex_framework.util.o
                    public void a(Throwable th) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("fb9ad88d", new Object[]{this, th});
                        } else {
                            countDownLatch.countDown();
                        }
                    }
                });
                try {
                    countDownLatch.await(1L, TimeUnit.SECONDS);
                } catch (Throwable th) {
                    com.taobao.android.weex_framework.util.g.a(th);
                }
            }
            textPaint.setTypeface(b.a(bVar));
        }
    }

    public Typeface a(final String str, final int i, final int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Typeface) ipChange.ipc$dispatch("5e4ad588", new Object[]{this, str, new Integer(i), new Integer(i2)});
        }
        if (StringUtils.isEmpty(str)) {
            return k.a(i, i2, null);
        }
        final b bVar = new b();
        final String b2 = b(str, i, i2);
        Typeface a2 = a(b2);
        if (a2 != null) {
            b.a(bVar, a2);
        } else {
            FontDO a3 = com.taobao.android.weex_framework.widget.a.a().a(str);
            boolean z = a3 == null || a3.c() != null;
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            final boolean z2 = z;
            this.f16220a.post(new o() { // from class: com.taobao.android.weex_uikit.widget.text.i.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.weex_framework.util.o
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    Typeface a4 = i.a(i.this, b2);
                    if (a4 == null && (a4 = k.a(i, i2, str)) != null && z2) {
                        i.a(i.this, b2, a4);
                    }
                    b.a(bVar, a4);
                    countDownLatch.countDown();
                }

                @Override // com.taobao.android.weex_framework.util.o
                public void a(Throwable th) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("fb9ad88d", new Object[]{this, th});
                    } else {
                        countDownLatch.countDown();
                    }
                }
            });
            try {
                countDownLatch.await(1L, TimeUnit.SECONDS);
            } catch (Throwable th) {
                com.taobao.android.weex_framework.util.g.a(th);
            }
        }
        return b.a(bVar);
    }

    private static String b(String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("91aba7ed", new Object[]{str, new Integer(i), new Integer(i2)}) : a(str, i, i2, 0);
    }

    private static String a(String str, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6cf8f", new Object[]{str, new Integer(i), new Integer(i2), new Integer(i3)});
        }
        return str + com.alibaba.security.realidentity.o.b + i3 + "s" + i + "w" + i2;
    }

    /* loaded from: classes6.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private volatile Typeface f16224a;

        static {
            kge.a(-417556714);
        }

        private b() {
        }

        public static /* synthetic */ Typeface a(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Typeface) ipChange.ipc$dispatch("54c036d7", new Object[]{bVar}) : bVar.f16224a;
        }

        public static /* synthetic */ Typeface a(b bVar, Typeface typeface) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Typeface) ipChange.ipc$dispatch("6cc0997b", new Object[]{bVar, typeface});
            }
            bVar.f16224a = typeface;
            return typeface;
        }
    }
}
