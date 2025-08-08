package tb;

import android.net.Uri;
import android.os.Looper;
import com.alibaba.android.aura.taobao.adapter.extension.linkage.service.utils.LinkageUtils;
import com.alibaba.jsi.standard.JSEngine;
import com.alibaba.jsi.standard.d;
import com.alibaba.jsi.standard.js.a;
import com.alibaba.jsi.standard.js.b;
import com.alibaba.jsi.standard.js.c;
import com.alibaba.jsi.standard.js.h;
import com.alibaba.jsi.standard.js.i;
import com.alibaba.jsi.standard.js.j;
import com.alibaba.jsi.standard.js.o;
import com.alibaba.jsi.standard.js.w;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pha.core.p;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import tb.neq;

/* loaded from: classes7.dex */
public class nen implements neq {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String b;
    private static final AtomicInteger j;

    /* renamed from: a  reason: collision with root package name */
    public d f31399a;
    private JSEngine c;
    private o d;
    private c e;
    private neq.a f;
    private final List<j> g = new ArrayList();
    private int h = 0;
    private boolean i = false;
    private final String k;

    public static /* synthetic */ o a(nen nenVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (o) ipChange.ipc$dispatch("829a3e87", new Object[]{nenVar}) : nenVar.d;
    }

    public static /* synthetic */ String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[0]) : b;
    }

    static {
        kge.a(-1932100212);
        kge.a(-1866197677);
        b = nen.class.getSimpleName();
        j = new AtomicInteger(1);
    }

    public nen(String str) {
        this.k = b(str);
        d();
    }

    public void a(neq.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a814d7a1", new Object[]{this, aVar});
        } else {
            this.f = aVar;
        }
    }

    private static String b(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{str});
        }
        String str3 = null;
        if (str == null) {
            return null;
        }
        try {
            Uri parse = Uri.parse(str);
            List<String> pathSegments = parse.getPathSegments();
            Uri.Builder builder = new Uri.Builder();
            builder.scheme(parse.getScheme()).authority(parse.getAuthority());
            if (pathSegments != null) {
                for (int i = 0; i < pathSegments.size() - 1; i++) {
                    String str4 = pathSegments.get(i);
                    if (str4 != null) {
                        builder.appendPath(str4);
                    }
                }
            }
            String uri = builder.build().toString();
            try {
                if (!uri.endsWith("/")) {
                    uri = uri + "/";
                }
                return uri;
            } catch (Exception e) {
                str3 = str2;
                e = e;
                ngr.b(b, e.toString());
                return str3;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    public void a(String str, final nek nekVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35f5628e", new Object[]{this, str, nekVar});
            return;
        }
        String str2 = b;
        ngr.a(str2, "js engine instance registerBinding " + str);
        try {
            if (this.f31399a != null && !this.f31399a.c()) {
                j jVar = new j(this.f31399a, new h() { // from class: tb.nen.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.alibaba.jsi.standard.js.h
                    public w onCallFunction(a aVar) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return (w) ipChange2.ipc$dispatch("8f6a3446", new Object[]{this, aVar});
                        }
                        if (nekVar == null) {
                            return null;
                        }
                        ArrayList arrayList = new ArrayList();
                        int a2 = aVar.a();
                        for (int i = 0; i < a2; i++) {
                            w a3 = aVar.a(i);
                            if (a3 instanceof j) {
                                arrayList.add(new nep(nen.this.f31399a, (j) a3, nen.a(nen.this)));
                            } else {
                                arrayList.add(ner.a(a3, nen.this.f31399a));
                            }
                        }
                        return ner.a(nekVar.a(new nes(arrayList)));
                    }
                }, str);
                this.d.a(this.f31399a, str, jVar);
                this.g.add(jVar);
            }
        } catch (Throwable th) {
            String str3 = b;
            ngr.b(str3, "register java method with exception: " + th.getMessage());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b4, code lost:
        if (r6 != null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(java.lang.String r6, java.util.ArrayList<java.lang.Object> r7) {
        /*
            r5 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.nen.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L18
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r4] = r5
            r1[r3] = r6
            r1[r2] = r7
            java.lang.String r6 = "e22c40b8"
            r0.ipc$dispatch(r6, r1)
            return
        L18:
            com.alibaba.jsi.standard.d r0 = r5.f31399a
            if (r0 == 0) goto Ld1
            boolean r0 = r0.c()
            if (r0 == 0) goto L24
            goto Ld1
        L24:
            boolean r0 = android.text.StringUtils.isEmpty(r6)
            if (r0 != 0) goto Ld1
            java.lang.String r0 = "\\."
            java.lang.String[] r6 = r6.split(r0)
            int r0 = r6.length
            if (r0 != r2) goto Ld1
            r0 = r6[r4]
            r6 = r6[r3]
            com.alibaba.jsi.standard.js.o r1 = r5.d
            com.alibaba.jsi.standard.d r2 = r5.f31399a
            com.alibaba.jsi.standard.js.w r0 = r1.a(r2, r0)
            boolean r1 = r0 instanceof com.alibaba.jsi.standard.js.o
            if (r1 == 0) goto Lcc
            r1 = r0
            com.alibaba.jsi.standard.js.o r1 = (com.alibaba.jsi.standard.js.o) r1
            com.alibaba.jsi.standard.d r2 = r5.f31399a
            com.alibaba.jsi.standard.js.w r6 = r1.a(r2, r6)
            r1 = 0
            boolean r2 = r6 instanceof com.alibaba.jsi.standard.js.j     // Catch: java.lang.Throwable -> L7e
            if (r2 == 0) goto L67
            com.alibaba.jsi.standard.js.w[] r1 = tb.ner.a(r7)     // Catch: java.lang.Throwable -> L7e
            r7 = r6
            com.alibaba.jsi.standard.js.j r7 = (com.alibaba.jsi.standard.js.j) r7     // Catch: java.lang.Throwable -> L7e
            com.alibaba.jsi.standard.d r2 = r5.f31399a     // Catch: java.lang.Throwable -> L7e
            com.alibaba.jsi.standard.js.w r7 = r7.a(r2, r0, r1)     // Catch: java.lang.Throwable -> L7e
            boolean r2 = r7 instanceof com.alibaba.jsi.standard.js.b     // Catch: java.lang.Throwable -> L7e
            if (r2 == 0) goto L67
            com.alibaba.jsi.standard.js.b r7 = (com.alibaba.jsi.standard.js.b) r7     // Catch: java.lang.Throwable -> L7e
            r7.a()     // Catch: java.lang.Throwable -> L7e
        L67:
            if (r1 == 0) goto L76
            int r7 = r1.length
        L6a:
            if (r4 >= r7) goto L76
            r2 = r1[r4]
            if (r2 == 0) goto L73
            r2.a()
        L73:
            int r4 = r4 + 1
            goto L6a
        L76:
            if (r6 == 0) goto Lcc
        L78:
            r6.a()
            goto Lcc
        L7c:
            r7 = move-exception
            goto Lb7
        L7e:
            r7 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7c
            r2.<init>()     // Catch: java.lang.Throwable -> L7c
            java.lang.String r3 = "Execute function with exception:\n"
            r2.append(r3)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r3 = tb.ngn.a(r7)     // Catch: java.lang.Throwable -> L7c
            r2.append(r3)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L7c
            tb.neq$a r3 = r5.f     // Catch: java.lang.Throwable -> L7c
            if (r3 == 0) goto L9d
            tb.neq$a r3 = r5.f     // Catch: java.lang.Throwable -> L7c
            r3.a(r2)     // Catch: java.lang.Throwable -> L7c
        L9d:
            r7.printStackTrace()     // Catch: java.lang.Throwable -> L7c
            java.lang.String r7 = tb.nen.b     // Catch: java.lang.Throwable -> L7c
            tb.ngr.b(r7, r2)     // Catch: java.lang.Throwable -> L7c
            if (r1 == 0) goto Lb4
            int r7 = r1.length
        La8:
            if (r4 >= r7) goto Lb4
            r2 = r1[r4]
            if (r2 == 0) goto Lb1
            r2.a()
        Lb1:
            int r4 = r4 + 1
            goto La8
        Lb4:
            if (r6 == 0) goto Lcc
            goto L78
        Lb7:
            if (r1 == 0) goto Lc6
            int r0 = r1.length
        Lba:
            if (r4 >= r0) goto Lc6
            r2 = r1[r4]
            if (r2 == 0) goto Lc3
            r2.a()
        Lc3:
            int r4 = r4 + 1
            goto Lba
        Lc6:
            if (r6 == 0) goto Lcb
            r6.a()
        Lcb:
            throw r7
        Lcc:
            if (r0 == 0) goto Ld1
            r0.a()
        Ld1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.nen.a(java.lang.String, java.util.ArrayList):void");
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        ngr.a(b, "js engine instance release ");
        if (h()) {
            return;
        }
        this.f = null;
        g();
        d dVar = this.f31399a;
        if (dVar != null) {
            dVar.b();
        }
        if (this.c.getContextCount() != 0) {
            return;
        }
        c cVar = this.e;
        if (cVar != null) {
            cVar.b();
        }
        this.e = null;
        this.c.dispose();
        this.c = null;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.i;
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        try {
            if (Looper.myLooper() == null) {
                Looper.prepare();
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                ngr.b(b, "*** ANR WARNING *** DO NOT instantiate JSEngine on main thread");
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (this.c == null) {
                nel B = p.b().B();
                String str = null;
                if (e()) {
                    str = "--disable-trap-java-exception";
                }
                this.c = B.a(p.e(), "PHA.AppWorker", "", str, null);
                if (this.c == null) {
                    throw new RuntimeException("js engine create null");
                }
                this.e = new c(this.c);
                this.e.a();
            }
            long currentTimeMillis2 = System.currentTimeMillis();
            String str2 = b;
            ngr.a(str2, "JSEngine initialized " + (currentTimeMillis2 - currentTimeMillis) + "ms");
            this.f31399a = this.c.createContext("context");
            this.d = this.f31399a.h();
            this.d.a(this.f31399a, LinkageUtils.PolicyType.SELF, this.d);
            f();
            this.i = true;
        } catch (Throwable th) {
            ngr.b(b, "init with exception:" + th.getMessage());
        }
    }

    private boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : p.c().l();
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        j jVar = new j(this.f31399a, new h() { // from class: tb.nen.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.jsi.standard.js.h
            public w onCallFunction(a aVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (w) ipChange2.ipc$dispatch("8f6a3446", new Object[]{this, aVar});
                }
                StringBuilder sb = new StringBuilder();
                if (aVar == null) {
                    return null;
                }
                for (int i = 0; i < aVar.a(); i++) {
                    w a2 = aVar.a(i);
                    if (i > 0) {
                        sb.append(" ");
                    }
                    sb.append(a2);
                    if (a2 instanceof b) {
                        a2.a();
                    }
                }
                String c = nen.c();
                ngr.b(c, "WorkerConsole " + sb.toString());
                return null;
            }
        }, "__nativeLog__");
        this.g.add(jVar);
        this.d.a(this.f31399a, "__nativeLog__", jVar);
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        for (j jVar : this.g) {
            if (jVar != null) {
                jVar.h(this.f31399a);
                jVar.d(this.f31399a);
                jVar.a();
            }
        }
        o oVar = this.d;
        if (oVar == null) {
            return;
        }
        oVar.a();
    }

    private boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue();
        }
        d dVar = this.f31399a;
        return dVar == null || dVar.c();
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        d dVar = this.f31399a;
        if (dVar == null || dVar.c()) {
            ngr.c(b, "js context is null or disposed");
            return;
        }
        try {
            this.h++;
            String str2 = "VM" + this.h + ".js";
            if (this.k != null) {
                str2 = this.k + str2;
            }
            this.f31399a.a(str, str2);
            i j2 = this.f31399a.j();
            if (j2 == null) {
                return;
            }
            String c = j2.c(this.f31399a);
            j2.a();
            this.f.a(c);
        } catch (Throwable th) {
            neq.a aVar = this.f;
            if (aVar != null) {
                aVar.a(ngn.a(th));
            }
            ngr.b(b, "Caught exception when executeScript " + ((Object) null) + "\n" + th.getMessage());
        }
    }
}
