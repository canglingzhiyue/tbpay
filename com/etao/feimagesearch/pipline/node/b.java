package com.etao.feimagesearch.pipline.node;

import android.graphics.Bitmap;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.pipline.NodeType;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.text.n;
import tb.cok;
import tb.coo;
import tb.coz;
import tb.cpa;
import tb.crj;
import tb.crl;
import tb.crm;
import tb.cro;
import tb.crq;
import tb.fkj;
import tb.kge;

/* loaded from: classes3.dex */
public final class b extends crj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Future<Map<String, String>> f6938a;
    private Future<Map<String, String>> b;
    private Future<Map<String, String>> c;
    private int d;
    private boolean e;
    private boolean f;
    private boolean g;
    private Integer i;
    private Integer j;

    static {
        kge.a(-1304819834);
    }

    public b() {
        this(false, false, false, null, null, 31, null);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.crj
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : NodeType.NODE_IMAGE_DETECT;
    }

    /* loaded from: classes3.dex */
    public static final class a<V> implements Callable<Map<String, String>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Bitmap f6939a;

        public a(Bitmap bitmap) {
            this.f6939a = bitmap;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Map<java.lang.String, java.lang.String>, java.lang.Object] */
        @Override // java.util.concurrent.Callable
        public /* synthetic */ Map<String, String> call() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("6d249ded", new Object[]{this}) : a();
        }

        public final Map<String, String> a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this});
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            coo a2 = cok.a();
            if (a2 != null) {
                cpa a3 = a2.a(this.f6939a);
                int a4 = a3.a();
                linkedHashMap.put("faceCount", String.valueOf(a4));
                if (a4 == -1) {
                    linkedHashMap.put("face", String.valueOf(a4));
                } else {
                    linkedHashMap.put("face", a4 > 0 ? String.valueOf(1) : String.valueOf(0));
                }
                if (!TextUtils.isEmpty(a3.b())) {
                    linkedHashMap.put(coo.KEY_CRO_SAMPLE_ID, a3.b());
                }
            } else {
                linkedHashMap.put("faceCount", String.valueOf(0));
                linkedHashMap.put("face", String.valueOf(-1));
            }
            return linkedHashMap;
        }
    }

    /* renamed from: com.etao.feimagesearch.pipline.node.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class CallableC0245b<V> implements Callable<Map<String, String>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Bitmap f6940a;

        public CallableC0245b(Bitmap bitmap) {
            this.f6940a = bitmap;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Map<java.lang.String, java.lang.String>, java.lang.Object] */
        @Override // java.util.concurrent.Callable
        public /* synthetic */ Map<String, String> call() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("6d249ded", new Object[]{this}) : a();
        }

        public final Map<String, String> a() {
            IpChange ipChange = $ipChange;
            boolean z = true;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this});
            }
            String b = coz.b(this.f6940a);
            if (b == null) {
                b = "";
            }
            q.a((Object) b, "WatermarkDetect.detectVideoWatermark(bitmap) ?: \"\"");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (b.length() <= 0) {
                z = false;
            }
            if (z) {
                if (b.length() > 6144) {
                    if (b == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    b = b.substring(0, 6144);
                    q.b(b, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                }
                linkedHashMap.put("videoWatermark", b);
                linkedHashMap.put("watermark", "true");
            }
            return linkedHashMap;
        }
    }

    /* loaded from: classes3.dex */
    public static final class c<V> implements Callable<Map<String, String>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Bitmap f6941a;

        public c(Bitmap bitmap) {
            this.f6941a = bitmap;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Map<java.lang.String, java.lang.String>, java.lang.Object] */
        @Override // java.util.concurrent.Callable
        public /* synthetic */ Map<String, String> call() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("6d249ded", new Object[]{this}) : a();
        }

        public final Map<String, String> a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this});
            }
            boolean a2 = coz.a(this.f6941a);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("watermark", String.valueOf(a2));
            linkedHashMap.put(com.etao.feimagesearch.model.d.KEY_FROM_OUTER_APP, "true");
            return linkedHashMap;
        }
    }

    public /* synthetic */ b(boolean z, boolean z2, boolean z3, Integer num, Integer num2, int i, o oVar) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) == 0 ? z3 : false, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : num2);
    }

    public b(boolean z, boolean z2, boolean z3, Integer num, Integer num2) {
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.i = num;
        this.j = num2;
    }

    @Override // tb.crj
    public crl b(crq pipLineDS) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (crl) ipChange.ipc$dispatch("45632432", new Object[]{this, pipLineDS});
        }
        q.c(pipLineDS, "pipLineDS");
        Bitmap d = pipLineDS.d();
        if (d == null) {
            a(-8, "需要检测的图片资源不存在");
            if (pipLineDS.t()) {
                return a((Object) null);
            }
            return crj.a(this, -8, "需要检测的图片资源不存在", false, 4, null);
        }
        this.f6938a = c(d);
        this.b = a(d);
        this.c = b(d);
        if (this.d == 0) {
            d();
            return a((Object) null);
        }
        return d(pipLineDS);
    }

    private final crl d(crq crqVar) {
        LinkedHashMap linkedHashMap;
        Integer num;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (crl) ipChange.ipc$dispatch("14a6d0f0", new Object[]{this, crqVar});
        }
        cro croVar = new cro();
        if (fkj.b(this.j)) {
            linkedHashMap = fkj.a().a(this.i);
            q.a((Object) linkedHashMap, "FaceDetectResultManager.…tResultWithMap(scanToken)");
        } else {
            linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("face", "-1");
            linkedHashMap.put("faceCount", "-1");
        }
        croVar.a(linkedHashMap);
        crqVar.c(linkedHashMap);
        String str = linkedHashMap.get("faceCount");
        int i = -1;
        if (str != null) {
            if (TextUtils.isEmpty(str)) {
                num = -1;
            } else {
                try {
                    num = n.d(str);
                } catch (Exception unused) {
                    num = -1;
                }
            }
            if (num != null) {
                i = num.intValue();
            }
        }
        com.etao.feimagesearch.newresult.perf.a.a(i);
        a("faceResult", JSONObject.toJSONString(linkedHashMap));
        a("faceTime", String.valueOf(SystemClock.elapsedRealtime() - b()));
        com.etao.feimagesearch.newresult.perf.a.d(Long.valueOf(SystemClock.elapsedRealtime() - b()));
        if (this.b == null && this.c == null) {
            a("watermarkTime", "-1");
            a("videoWatermarkTime", "-1");
            d();
            com.etao.feimagesearch.newresult.perf.a.c(Long.valueOf(SystemClock.elapsedRealtime() - b()));
            return a(croVar);
        }
        com.etao.feimagesearch.newresult.perf.a.c(Long.valueOf(SystemClock.elapsedRealtime() - b()));
        return c(crqVar);
    }

    private final crm c(crq crqVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (crm) ipChange.ipc$dispatch("2d04fab0", new Object[]{this, crqVar}) : new crm(a(), new ImageDetectNode$assembleHoldEvent$event$1(this, crqVar));
    }

    private final Future<Map<String, String>> a(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("d3c5cd5c", new Object[]{this, bitmap});
        }
        if (!this.e || !com.etao.feimagesearch.config.b.z()) {
            return null;
        }
        this.d++;
        return com.etao.feimagesearch.pipline.c.a(new c(bitmap));
    }

    private final Future<Map<String, String>> b(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("60b2e47b", new Object[]{this, bitmap});
        }
        if (!this.f || !com.etao.feimagesearch.config.b.A()) {
            return null;
        }
        this.d++;
        return com.etao.feimagesearch.pipline.c.a(new CallableC0245b(bitmap));
    }

    private final Future<Map<String, String>> c(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("ed9ffb9a", new Object[]{this, bitmap});
        }
        if (!this.g || !com.etao.feimagesearch.config.b.R()) {
            return null;
        }
        this.d++;
        if (!fkj.b(this.j)) {
            return com.etao.feimagesearch.pipline.c.a(new a(bitmap));
        }
        return null;
    }
}
