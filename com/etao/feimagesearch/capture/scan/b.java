package com.etao.feimagesearch.capture.scan;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.scan.IDecodeTask;
import com.etao.feimagesearch.capture.scan.a;
import com.taobao.android.virtual_thread.face.VExecutors;
import com.taobao.taobao.scancode.huoyan.object.KakaLibImageWrapper;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.cot;
import tb.cov;
import tb.cox;
import tb.coy;
import tb.cqc;
import tb.kge;

/* loaded from: classes3.dex */
public final class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    public static final String TAG = "_scancode_DecodeManager";
    private static final AtomicInteger g;

    /* renamed from: a  reason: collision with root package name */
    private com.etao.feimagesearch.capture.scan.c f6582a;
    private final long b;
    private final Handler c;
    private volatile boolean d;
    private final ExecutorService e;
    private final Activity i;

    /* renamed from: com.etao.feimagesearch.capture.scan.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0220b implements a.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Ref.BooleanRef f6583a;
        public final /* synthetic */ AtomicBoolean b;
        public final /* synthetic */ long c;
        public final /* synthetic */ String d;
        public final /* synthetic */ com.etao.feimagesearch.capture.scan.c e;
        public final /* synthetic */ cqc f;
        public final /* synthetic */ CountDownLatch g;

        public C0220b(Ref.BooleanRef booleanRef, AtomicBoolean atomicBoolean, long j, String str, com.etao.feimagesearch.capture.scan.c cVar, cqc cqcVar, CountDownLatch countDownLatch) {
            this.f6583a = booleanRef;
            this.b = atomicBoolean;
            this.c = j;
            this.d = str;
            this.e = cVar;
            this.f = cqcVar;
            this.g = countDownLatch;
        }

        @Override // com.etao.feimagesearch.capture.scan.a.b
        public void a(ArrayList<Rect> arrayList) {
            IpChange ipChange = $ipChange;
            boolean z = true;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dfaf7e42", new Object[]{this, arrayList});
                return;
            }
            int size = (arrayList == null || arrayList.size() <= 0) ? 0 : arrayList.size();
            cot.a("Scan", b.TAG, "detectResult: codeNum=" + size + ", isCodeDetectTimeout=" + this.f6583a.element);
            if (this.f6583a.element) {
                return;
            }
            this.b.set(size > 0);
            long currentTimeMillis = System.currentTimeMillis() - this.c;
            String str = com.etao.feimagesearch.structure.capture.a.f6987a;
            ScanMode e = this.e.e();
            q.a((Object) e, "decodeTaskV2.scanMode");
            coy.a(str, "albumCodeDetectTask", 19999, "costTime", String.valueOf(currentTimeMillis), "strategy", this.d, "codeNum", String.valueOf(size), "scanMode", e.getScanMode());
            cqc cqcVar = this.f;
            if (size <= 0) {
                z = false;
            }
            cqcVar.a(z);
            this.f.a(currentTimeMillis);
            this.g.countDown();
        }
    }

    /* loaded from: classes3.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ com.etao.feimagesearch.capture.scan.c b;
        public final /* synthetic */ com.etao.feimagesearch.capture.scan.a c;
        public final /* synthetic */ long d;
        public final /* synthetic */ Map e;

        public c(com.etao.feimagesearch.capture.scan.c cVar, Map map, com.etao.feimagesearch.capture.scan.a aVar, long j) {
            this.b = cVar;
            this.e = map;
            this.c = aVar;
            this.d = j;
        }

        @Override // java.lang.Runnable
        public final void run() {
            b bVar;
            long j;
            com.etao.feimagesearch.capture.scan.c cVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                if (!b.a(b.this, this.b)) {
                    if (b.c(b.this, this.b)) {
                        com.etao.feimagesearch.capture.scan.c a2 = b.a(b.this);
                        if (a2 != null) {
                            a2.a(IDecodeTask.TaskStatus.CANCELLED);
                        }
                        b.b(b.this, this.b);
                        bVar = b.this;
                        j = this.d;
                        cVar = this.b;
                    }
                    b.a(b.this, this.b, this.b.c(), false);
                }
                Map map = this.e;
                String str = map != null ? (String) map.get("loadCostTime") : null;
                long j2 = 0;
                if (str != null) {
                    j2 = cov.a(str, 0L);
                }
                if (!b.a(b.this, this.b, this.c, j2)) {
                    if (this.b.a()) {
                        return;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("post empty result ");
                    KakaLibImageWrapper b = this.b.b();
                    q.a((Object) b, "decodeTaskV2.detectedImageWrapper");
                    sb.append(b.g());
                    cot.c(b.TAG, sb.toString());
                    b.a(b.this, this.b, (i) null, false);
                    return;
                }
                com.etao.feimagesearch.capture.scan.c a3 = b.a(b.this);
                if (a3 != null) {
                    a3.a(IDecodeTask.TaskStatus.CANCELLED);
                }
                b.b(b.this, this.b);
                bVar = b.this;
                j = this.d;
                cVar = this.b;
                b.a(bVar, j, cVar);
                b.a(b.this, this.b, this.b.c(), false);
            } catch (Exception e) {
                cot.b(b.TAG, String.valueOf(e.getMessage()));
                b.a(b.this, this.b, (i) null, false);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class d implements com.taobao.android.virtual_thread.face.h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.virtual_thread.face.h
        public String newThreadName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("57dab4a4", new Object[]{this});
            }
            return "DecodeManager_" + hashCode() + "_" + b.Companion.a().getAndIncrement();
        }
    }

    /* loaded from: classes3.dex */
    public static final class e implements Handler.Callback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message msg) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, msg})).booleanValue();
            }
            q.c(msg, "msg");
            if (msg.what != 100001 || !(msg.obj instanceof com.etao.feimagesearch.capture.scan.c)) {
                return false;
            }
            Object obj = msg.obj;
            if (obj == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.etao.feimagesearch.capture.scan.DecoderTaskV2");
            }
            com.etao.feimagesearch.capture.scan.c cVar = (com.etao.feimagesearch.capture.scan.c) obj;
            if (!b.b(b.this) && !cVar.a()) {
                cot.a("AutoDetect", b.TAG, "album decode timeout");
                cox.b(com.etao.feimagesearch.structure.capture.a.f6987a, "scanTimeout", "detectType", String.valueOf(cVar.f6587a));
                b.a(b.this, cVar, (i) null, true);
            }
            return true;
        }
    }

    /* loaded from: classes3.dex */
    public static final class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ i c;
        public final /* synthetic */ com.etao.feimagesearch.capture.scan.c e;

        public f(boolean z, com.etao.feimagesearch.capture.scan.c cVar, i iVar) {
            this.b = z;
            this.e = cVar;
            this.c = iVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (this.b) {
                l m = this.e.m();
                if (m == null) {
                    return;
                }
                m.a(this.e);
            } else {
                if (!this.e.d()) {
                    b.c(b.this).removeCallbacksAndMessages(null);
                }
                l m2 = this.e.m();
                if (m2 == null) {
                    return;
                }
                m2.a(this.e, this.c);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1300079347);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        public final AtomicInteger a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (AtomicInteger) ipChange.ipc$dispatch("f45a6d52", new Object[]{this}) : b.d();
        }
    }

    public b(Activity activity) {
        q.c(activity, "activity");
        this.i = activity;
        this.b = com.etao.feimagesearch.config.b.cV();
        this.c = new Handler(Looper.getMainLooper(), new e());
        ExecutorService newSingleThreadExecutor = VExecutors.newSingleThreadExecutor(new d());
        q.a((Object) newSingleThreadExecutor, "VExecutors.newSingleThre…ement()\n        }\n    } )");
        this.e = newSingleThreadExecutor;
        AppMonitor.register("Plt_Scan", "loadAlbum", MeasureSet.create().addMeasure("loadCostTime"), DimensionSet.create().addDimension("deviceLevel"));
    }

    public static final /* synthetic */ com.etao.feimagesearch.capture.scan.c a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.etao.feimagesearch.capture.scan.c) ipChange.ipc$dispatch("fddeb759", new Object[]{bVar}) : bVar.f6582a;
    }

    public static final /* synthetic */ void a(b bVar, long j, com.etao.feimagesearch.capture.scan.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f51a2365", new Object[]{bVar, new Long(j), cVar});
        } else {
            bVar.a(j, cVar);
        }
    }

    public static final /* synthetic */ void a(b bVar, com.etao.feimagesearch.capture.scan.c cVar, i iVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("118befc9", new Object[]{bVar, cVar, iVar, new Boolean(z)});
        } else {
            bVar.a(cVar, iVar, z);
        }
    }

    public static final /* synthetic */ boolean a(b bVar, com.etao.feimagesearch.capture.scan.c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e6b88ab", new Object[]{bVar, cVar})).booleanValue() : bVar.a(cVar);
    }

    public static final /* synthetic */ boolean a(b bVar, com.etao.feimagesearch.capture.scan.c cVar, com.etao.feimagesearch.capture.scan.a aVar, long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("111af7b5", new Object[]{bVar, cVar, aVar, new Long(j)})).booleanValue() : bVar.a(cVar, aVar, j);
    }

    public static final /* synthetic */ void b(b bVar, com.etao.feimagesearch.capture.scan.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45e76268", new Object[]{bVar, cVar});
        } else {
            bVar.f6582a = cVar;
        }
    }

    public static final /* synthetic */ boolean b(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ae606054", new Object[]{bVar})).booleanValue() : bVar.d;
    }

    public static final /* synthetic */ Handler c(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("f9d0b7", new Object[]{bVar}) : bVar.c;
    }

    public static final /* synthetic */ boolean c(b bVar, com.etao.feimagesearch.capture.scan.c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ed633c2d", new Object[]{bVar, cVar})).booleanValue() : bVar.b(cVar);
    }

    public static final /* synthetic */ AtomicInteger d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicInteger) ipChange.ipc$dispatch("54c8e015", new Object[0]) : g;
    }

    static {
        kge.a(668726277);
        Companion = new a(null);
        g = new AtomicInteger(0);
    }

    public final void a(com.etao.feimagesearch.capture.scan.c decodeTaskV2, com.etao.feimagesearch.capture.scan.a aVar, long j, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aee1feeb", new Object[]{this, decodeTaskV2, aVar, new Long(j), map});
            return;
        }
        q.c(decodeTaskV2, "decodeTaskV2");
        if (this.d) {
            cot.a("PltCameraScan", TAG, "DecodeManager destroyed");
        } else {
            this.e.execute(new c(decodeTaskV2, map, aVar, j));
        }
    }

    private final boolean a(com.etao.feimagesearch.capture.scan.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eb746b54", new Object[]{this, cVar})).booleanValue();
        }
        KakaLibImageWrapper b = cVar.b();
        q.a((Object) b, "decodeTaskV2.detectedImageWrapper");
        return !TextUtils.isEmpty(b.g());
    }

    private final boolean b(com.etao.feimagesearch.capture.scan.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ae60d4b3", new Object[]{this, cVar})).booleanValue();
        }
        if (!a(cVar)) {
            KakaLibImageWrapper b = cVar.b();
            q.a((Object) b, "decodeTaskV2.detectedImageWrapper");
            if (b.e() != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0089, code lost:
        if (r3 == null) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean a(com.etao.feimagesearch.capture.scan.c r24, com.etao.feimagesearch.capture.scan.a r25, long r26) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etao.feimagesearch.capture.scan.b.a(com.etao.feimagesearch.capture.scan.c, com.etao.feimagesearch.capture.scan.a, long):boolean");
    }

    private final void a(long j, com.etao.feimagesearch.capture.scan.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("492d95dc", new Object[]{this, new Long(j), cVar});
            return;
        }
        cot.c(TAG, "beginTimeoutTask: timeout=" + j + ", decodeTaskV2=" + cVar.b().hashCode());
        Message obtainMessage = this.c.obtainMessage(100001);
        q.a((Object) obtainMessage, "mainHandler.obtainMessag…MSG_DECODE_ALBUM_TIMEOUT)");
        obtainMessage.obj = cVar;
        this.c.removeMessages(100001);
        this.c.sendMessageDelayed(obtainMessage, j);
    }

    private final void a(com.etao.feimagesearch.capture.scan.c cVar, i iVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2473572", new Object[]{this, cVar, iVar, new Boolean(z)});
            return;
        }
        if (q.a(this.f6582a, cVar)) {
            this.f6582a = null;
        }
        if (cVar.a()) {
            return;
        }
        this.c.post(new f(z, cVar, iVar));
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        cot.c(TAG, "onPause");
        this.c.removeMessages(100001);
        com.etao.feimagesearch.capture.scan.c cVar = this.f6582a;
        if (cVar == null || cVar.i()) {
            return;
        }
        cVar.a(IDecodeTask.TaskStatus.CANCELLED);
        this.f6582a = null;
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        cot.c(TAG, "destroy");
        this.c.removeCallbacksAndMessages(null);
        this.f6582a = null;
        this.d = true;
        this.e.shutdown();
    }
}
