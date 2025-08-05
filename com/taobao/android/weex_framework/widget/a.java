package com.taobao.android.weex_framework.widget;

import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.adapter.c;
import com.taobao.android.weex_framework.l;
import com.taobao.android.weex_framework.m;
import com.taobao.android.weex_framework.util.e;
import com.taobao.android.weex_framework.util.g;
import com.taobao.android.weex_framework.util.o;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tb.kge;

/* loaded from: classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final Handler b;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, Set<WeakReference<b>>> f16099a;
    private Map<String, FontDO> c;

    /* renamed from: com.taobao.android.weex_framework.widget.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static class C0620a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final a f16104a;

        static {
            kge.a(-713161631);
            f16104a = new a();
        }

        public static /* synthetic */ a a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("c7d4c24b", new Object[0]) : f16104a;
        }
    }

    /* loaded from: classes6.dex */
    public interface b {
        void a(FontDO fontDO);
    }

    public static /* synthetic */ Map a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("236ef7ba", new Object[]{aVar}) : aVar.c;
    }

    public static /* synthetic */ boolean a(a aVar, String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ac64d51f", new Object[]{aVar, str, str2, new Boolean(z)})).booleanValue() : aVar.a(str, str2, z);
    }

    public static /* synthetic */ Map b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("16fe7bfb", new Object[]{aVar}) : aVar.f16099a;
    }

    static {
        kge.a(1095489455);
        b = new Handler(Looper.getMainLooper());
    }

    private a() {
        this.f16099a = new HashMap();
        this.c = new HashMap();
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("c7d4c24b", new Object[0]) : C0620a.a();
    }

    public synchronized FontDO a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FontDO) ipChange.ipc$dispatch("b7af65a", new Object[]{this, str});
        }
        return this.c.get(str);
    }

    public synchronized void a(FontDO fontDO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bfaae90", new Object[]{this, fontDO});
        } else {
            this.c.put(fontDO.e(), fontDO);
        }
    }

    public synchronized void a(FontDO fontDO, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("435bd644", new Object[]{this, fontDO, new Boolean(z)});
            return;
        }
        com.taobao.android.weex_framework.adapter.b e = l.a().e();
        boolean z2 = (fontDO == null || e == null || !e.b(fontDO.e())) ? false : true;
        if (fontDO == null || fontDO.c() != null || (fontDO.d() != 3 && fontDO.d() != 0 && !z2)) {
            if (z) {
                b(fontDO);
            }
            return;
        }
        fontDO.a(1);
        if (z2) {
            Typeface a2 = e.a(fontDO.e());
            if (a2 != null) {
                fontDO.a(a2);
                fontDO.a(2);
                if (z) {
                    b(fontDO);
                }
            }
        } else if (fontDO.b() == 3) {
            a(fontDO, Uri.parse(fontDO.a()).getPath().substring(1));
        } else if (fontDO.b() == 1) {
            String a3 = fontDO.a();
            String e2 = fontDO.e();
            String a4 = e.a(a3);
            File file = new File(b());
            if (!file.exists()) {
                file.mkdirs();
            }
            String str = file.getAbsolutePath() + File.separator + a4;
            if (!a(str, e2, false)) {
                a(a3, str, e2);
            }
        } else {
            if ((fontDO.b() == 2 || fontDO.b() == 5) && !a(fontDO.a(), fontDO.e(), false)) {
                fontDO.a(3);
            }
        }
    }

    private static void a(FontDO fontDO, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f287545a", new Object[]{fontDO, str});
            return;
        }
        try {
            Typeface createFromAsset = Typeface.createFromAsset(m.b().getAssets(), str);
            if (createFromAsset != null) {
                if (g.a()) {
                    g.a("[FontManager] font " + fontDO.e() + " load asset file success");
                }
                fontDO.a(2);
                fontDO.a(createFromAsset);
                return;
            }
            g.d("[FontManager] Font " + fontDO.e() + " asset file not found " + fontDO.a());
        } catch (Exception e) {
            g.a(e);
        }
    }

    private static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]);
        }
        return m.b().getCacheDir() + "/" + com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_font_family;
    }

    private void a(final String str, final String str2, final String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
            return;
        }
        c g = l.a().g();
        if (g == null) {
            g.d("downloadFontByNetwork() IMUSHttpAdapter == null");
            return;
        }
        com.taobao.android.weex_framework.common.a aVar = new com.taobao.android.weex_framework.common.a();
        aVar.c = str;
        aVar.d = "GET";
        g.a(aVar, new c.a() { // from class: com.taobao.android.weex_framework.widget.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.weex_framework.adapter.c.a
            public void a(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                }
            }

            @Override // com.taobao.android.weex_framework.adapter.c.a
            public void a(int i, Map<String, List<String>> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7fc93e8a", new Object[]{this, new Integer(i), map});
                }
            }

            @Override // com.taobao.android.weex_framework.adapter.c.a
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else if (!g.a()) {
                } else {
                    g.b("downloadFontByNetwork begin url:" + str);
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:22:0x0058 A[Catch: all -> 0x0086, TryCatch #1 {, blocks: (B:8:0x0018, B:10:0x0020, B:18:0x0046, B:20:0x004a, B:22:0x0058, B:23:0x0063, B:25:0x0069, B:27:0x0070, B:29:0x0080, B:30:0x0084, B:12:0x0027), top: B:37:0x0018, inners: #0 }] */
            /* JADX WARN: Removed duplicated region for block: B:23:0x0063 A[Catch: all -> 0x0086, TryCatch #1 {, blocks: (B:8:0x0018, B:10:0x0020, B:18:0x0046, B:20:0x004a, B:22:0x0058, B:23:0x0063, B:25:0x0069, B:27:0x0070, B:29:0x0080, B:30:0x0084, B:12:0x0027), top: B:37:0x0018, inners: #0 }] */
            @Override // com.taobao.android.weex_framework.adapter.c.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void a(com.taobao.android.weex_framework.common.b r6) {
                /*
                    r5 = this;
                    com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.weex_framework.widget.a.AnonymousClass1.$ipChange
                    boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
                    r2 = 1
                    r3 = 0
                    if (r1 == 0) goto L15
                    r1 = 2
                    java.lang.Object[] r1 = new java.lang.Object[r1]
                    r1[r3] = r5
                    r1[r2] = r6
                    java.lang.String r6 = "2660175d"
                    r0.ipc$dispatch(r6, r1)
                    return
                L15:
                    com.taobao.android.weex_framework.widget.a r0 = com.taobao.android.weex_framework.widget.a.this
                    monitor-enter(r0)
                    java.lang.String r1 = r6.f15987a     // Catch: java.lang.Throwable -> L86
                    boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L86
                    if (r1 != 0) goto L3d
                    java.lang.String r1 = r6.f15987a     // Catch: java.lang.NumberFormatException -> L27 java.lang.Throwable -> L86
                    int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L27 java.lang.Throwable -> L86
                    goto L3e
                L27:
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L86
                    r1.<init>()     // Catch: java.lang.Throwable -> L86
                    java.lang.String r4 = "IWXHttpAdapter onHttpFinish statusCode:"
                    r1.append(r4)     // Catch: java.lang.Throwable -> L86
                    java.lang.String r4 = r6.f15987a     // Catch: java.lang.Throwable -> L86
                    r1.append(r4)     // Catch: java.lang.Throwable -> L86
                    java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L86
                    com.taobao.android.weex_framework.util.g.d(r1)     // Catch: java.lang.Throwable -> L86
                L3d:
                    r1 = 0
                L3e:
                    r4 = 200(0xc8, float:2.8E-43)
                    if (r1 < r4) goto L6e
                    r4 = 299(0x12b, float:4.19E-43)
                    if (r1 > r4) goto L6e
                    byte[] r1 = r6.b     // Catch: java.lang.Throwable -> L86
                    if (r1 == 0) goto L6e
                    java.lang.String r1 = r3     // Catch: java.lang.Throwable -> L86
                    byte[] r6 = r6.b     // Catch: java.lang.Throwable -> L86
                    android.app.Application r3 = com.taobao.android.weex_framework.m.b()     // Catch: java.lang.Throwable -> L86
                    boolean r3 = com.taobao.android.weex_framework.util.e.a(r1, r6, r3)     // Catch: java.lang.Throwable -> L86
                    if (r3 == 0) goto L63
                    com.taobao.android.weex_framework.widget.a r6 = com.taobao.android.weex_framework.widget.a.this     // Catch: java.lang.Throwable -> L86
                    java.lang.String r1 = r3     // Catch: java.lang.Throwable -> L86
                    java.lang.String r3 = r4     // Catch: java.lang.Throwable -> L86
                    boolean r3 = com.taobao.android.weex_framework.widget.a.a(r6, r1, r3, r2)     // Catch: java.lang.Throwable -> L86
                    goto L6e
                L63:
                    boolean r6 = com.taobao.android.weex_framework.util.g.a()     // Catch: java.lang.Throwable -> L86
                    if (r6 == 0) goto L6e
                    java.lang.String r6 = "downloadFontByNetwork() onHttpFinish success, but save file failed."
                    com.taobao.android.weex_framework.util.g.c(r6)     // Catch: java.lang.Throwable -> L86
                L6e:
                    if (r3 != 0) goto L84
                    com.taobao.android.weex_framework.widget.a r6 = com.taobao.android.weex_framework.widget.a.this     // Catch: java.lang.Throwable -> L86
                    java.util.Map r6 = com.taobao.android.weex_framework.widget.a.a(r6)     // Catch: java.lang.Throwable -> L86
                    java.lang.String r1 = r4     // Catch: java.lang.Throwable -> L86
                    java.lang.Object r6 = r6.get(r1)     // Catch: java.lang.Throwable -> L86
                    com.taobao.android.weex_framework.widget.FontDO r6 = (com.taobao.android.weex_framework.widget.FontDO) r6     // Catch: java.lang.Throwable -> L86
                    if (r6 == 0) goto L84
                    r1 = 3
                    r6.a(r1)     // Catch: java.lang.Throwable -> L86
                L84:
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L86
                    return
                L86:
                    r6 = move-exception
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L86
                    throw r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.weex_framework.widget.a.AnonymousClass1.a(com.taobao.android.weex_framework.common.b):void");
            }
        });
    }

    private boolean a(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4dbad4dc", new Object[]{this, str, str2, new Boolean(z)})).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                if (!new File(str).exists()) {
                    return false;
                }
                Typeface createFromFile = Typeface.createFromFile(str);
                if (createFromFile != null) {
                    FontDO fontDO = this.c.get(str2);
                    if (fontDO != null) {
                        fontDO.a(2);
                        fontDO.a(createFromFile);
                        fontDO.a(str);
                        if (g.a()) {
                            g.b("[FontManager] font " + str2 + "load local font file success");
                        }
                        b(fontDO);
                        return true;
                    }
                } else {
                    g.d("[FontManager] load local font file failed, can't create font.");
                }
            } catch (Exception e) {
                g.a(e);
            }
        }
        return false;
    }

    private void b(final FontDO fontDO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56162d2f", new Object[]{this, fontDO});
        } else {
            b.post(new o() { // from class: com.taobao.android.weex_framework.widget.a.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.weex_framework.util.o
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    Set set = (Set) a.b(a.this).get(fontDO.e());
                    if (set == null) {
                        return;
                    }
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        b bVar = (b) ((WeakReference) it.next()).get();
                        if (bVar == null) {
                            it.remove();
                        } else {
                            bVar.a(fontDO);
                        }
                    }
                }
            });
        }
    }

    public void a(final String str, final b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3af07fd1", new Object[]{this, str, bVar});
            return;
        }
        o oVar = new o() { // from class: com.taobao.android.weex_framework.widget.a.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.weex_framework.util.o
            public void a() throws Exception {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                Set set = (Set) a.b(a.this).get(str);
                if (set == null) {
                    set = new HashSet();
                    a.b(a.this).put(str, set);
                }
                set.add(new WeakReference(bVar));
            }
        };
        if (Looper.getMainLooper() == Looper.myLooper()) {
            oVar.run();
        } else {
            b.post(oVar);
        }
    }

    public void b(final String str, final b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c420f52", new Object[]{this, str, bVar});
            return;
        }
        o oVar = new o() { // from class: com.taobao.android.weex_framework.widget.a.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.weex_framework.util.o
            public void a() throws Exception {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                Set set = (Set) a.b(a.this).get(str);
                if (set == null) {
                    return;
                }
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    b bVar2 = (b) ((WeakReference) it.next()).get();
                    if (bVar2 == null || bVar2 == bVar) {
                        it.remove();
                    }
                }
            }
        };
        if (Looper.getMainLooper() == Looper.myLooper()) {
            oVar.run();
        } else {
            b.post(oVar);
        }
    }
}
