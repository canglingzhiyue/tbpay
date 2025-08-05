package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.extension.page.u;
import com.taobao.themis.kernel.page.ITMSPage;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.q;

/* loaded from: classes9.dex */
public final class tmf implements u {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f34212a;
    private final CopyOnWriteArraySet<u.c> b;
    private final AtomicBoolean c;
    private final ITMSPage d;

    static {
        kge.a(-1201397992);
        kge.a(-2059666282);
    }

    public tmf(ITMSPage page) {
        q.d(page, "page");
        this.d = page;
        this.b = new CopyOnWriteArraySet<>();
        this.c = new AtomicBoolean(false);
    }

    @Override // com.taobao.themis.kernel.extension.page.g
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            u.b.c(this);
        }
    }

    @Override // com.taobao.themis.kernel.extension.page.g
    public void c_(ITMSPage page) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f4ed18e", new Object[]{this, page});
            return;
        }
        q.d(page, "page");
        u.b.a(this, page);
    }

    @Override // com.taobao.themis.kernel.extension.page.g
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else {
            u.b.b(this);
        }
    }

    @Override // com.taobao.themis.kernel.extension.page.u
    public void a(u.c callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff7a31d9", new Object[]{this, callback});
            return;
        }
        q.d(callback, "callback");
        if (this.c.get()) {
            callback.a(this.f34212a);
        } else {
            this.b.add(callback);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029 A[Catch: Exception -> 0x0061, TryCatch #0 {Exception -> 0x0061, blocks: (B:7:0x0018, B:9:0x001d, B:15:0x0029, B:17:0x002f, B:19:0x0035, B:21:0x003c, B:22:0x0046, B:23:0x004d, B:24:0x004e), top: B:33:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0078 A[LOOP:0: B:28:0x0072->B:30:0x0078, LOOP_END] */
    @Override // com.taobao.themis.kernel.extension.page.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(java.lang.String r13) {
        /*
            r12 = this;
            java.lang.String r0 = "\""
            com.android.alibaba.ip.runtime.IpChange r1 = tb.tmf.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L17
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r4] = r12
            r0[r5] = r13
            java.lang.String r13 = "f3a64c32"
            r1.ipc$dispatch(r13, r0)
            return
        L17:
            r1 = 0
            r2 = r13
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2     // Catch: java.lang.Exception -> L61
            if (r2 == 0) goto L26
            int r2 = r2.length()     // Catch: java.lang.Exception -> L61
            if (r2 != 0) goto L24
            goto L26
        L24:
            r2 = 0
            goto L27
        L26:
            r2 = 1
        L27:
            if (r2 != 0) goto L65
            boolean r2 = kotlin.text.n.b(r13, r0, r4, r3, r1)     // Catch: java.lang.Exception -> L61
            if (r2 == 0) goto L4e
            boolean r0 = kotlin.text.n.c(r13, r0, r4, r3, r1)     // Catch: java.lang.Exception -> L61
            if (r0 == 0) goto L4e
            int r0 = r13.length()     // Catch: java.lang.Exception -> L61
            int r0 = r0 - r5
            if (r13 == 0) goto L46
            java.lang.String r13 = r13.substring(r5, r0)     // Catch: java.lang.Exception -> L61
            java.lang.String r0 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            kotlin.jvm.internal.q.b(r13, r0)     // Catch: java.lang.Exception -> L61
            goto L4e
        L46:
            java.lang.NullPointerException r13 = new java.lang.NullPointerException     // Catch: java.lang.Exception -> L61
            java.lang.String r0 = "null cannot be cast to non-null type java.lang.String"
            r13.<init>(r0)     // Catch: java.lang.Exception -> L61
            throw r13     // Catch: java.lang.Exception -> L61
        L4e:
            r6 = r13
            java.lang.String r7 = "\\"
            java.lang.String r8 = ""
            r9 = 0
            r10 = 4
            r11 = 0
            java.lang.String r13 = kotlin.text.n.a(r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Exception -> L61
            com.alibaba.fastjson.JSONObject r13 = com.alibaba.fastjson.JSON.parseObject(r13)     // Catch: java.lang.Exception -> L61
            r12.f34212a = r13     // Catch: java.lang.Exception -> L61
            goto L65
        L61:
            com.alibaba.fastjson.JSONObject r1 = (com.alibaba.fastjson.JSONObject) r1
            r12.f34212a = r1
        L65:
            java.util.concurrent.atomic.AtomicBoolean r13 = r12.c
            r13.set(r5)
            java.util.concurrent.CopyOnWriteArraySet<com.taobao.themis.kernel.extension.page.u$c> r13 = r12.b
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.Iterator r13 = r13.iterator()
        L72:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L84
            java.lang.Object r0 = r13.next()
            com.taobao.themis.kernel.extension.page.u$c r0 = (com.taobao.themis.kernel.extension.page.u.c) r0
            com.alibaba.fastjson.JSONObject r1 = r12.f34212a
            r0.a(r1)
            goto L72
        L84:
            java.util.concurrent.CopyOnWriteArraySet<com.taobao.themis.kernel.extension.page.u$c> r13 = r12.b
            r13.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.tmf.a(java.lang.String):void");
    }
}
