package com.etao.feimagesearch.mnn;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.nn.NetConfig;
import com.etao.feimagesearch.nn.optimize.OptimizeOutput;
import com.etao.feimagesearch.util.f;
import com.taobao.android.mnncv.MNNCVExecutor;
import com.taobao.mrt.task.MRTRuntimeException;
import java.util.HashMap;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.TypeCastException;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.t;
import tb.cof;
import tb.cot;
import tb.coy;
import tb.kge;

/* loaded from: classes3.dex */
public final class a extends BaseMnnRunUnit<com.etao.feimagesearch.nn.optimize.a, OptimizeOutput> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final C0230a Companion;
    public static final String TAG = "AdvanceObjectUnit";
    public static final String TASK_NAME = "plt_autodetect";
    private static final kotlin.d c;

    /* renamed from: a  reason: collision with root package name */
    private final com.etao.feimagesearch.mnn.utils.b f6746a;
    private final NetConfig b;
    private String d;

    /* loaded from: classes3.dex */
    public static final class c implements MNNCVExecutor.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f6749a;
        public final /* synthetic */ a b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ d d;
        public final /* synthetic */ Bitmap e;

        public c(long j, a aVar, boolean z, d dVar, Bitmap bitmap) {
            this.f6749a = j;
            this.b = aVar;
            this.c = z;
            this.d = dVar;
            this.e = bitmap;
        }

        @Override // com.taobao.android.mnncv.MNNCVExecutor.b
        public void onResult(MRTRuntimeException mRTRuntimeException, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dce89cd6", new Object[]{this, mRTRuntimeException, map});
            } else if (mRTRuntimeException != null) {
                cot.b(a.TAG, "errorCode: " + mRTRuntimeException.errorCode + ", errorMsg: " + mRTRuntimeException.getMessage());
                this.d.a((Throwable) mRTRuntimeException);
            } else if (map == null) {
                this.d.a((Throwable) new RuntimeException("result and exception are all null"));
            } else {
                long currentTimeMillis = System.currentTimeMillis() - this.f6749a;
                String jSONString = JSON.toJSONString(map);
                a.b(this.b).a(currentTimeMillis);
                a.b(this.b).a(jSONString);
                cot.c(a.TAG, "result = " + jSONString + ", costTime = " + currentTimeMillis + ", width: " + this.e.getWidth() + 'x' + this.e.getHeight() + ' ');
                a.a(this.b, this.e, map, currentTimeMillis, this.d);
            }
        }
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -207205326) {
            super.a((String) objArr[0]);
            return null;
        } else if (hashCode != 841311143) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.a((k) objArr[0], (String) objArr[1]);
            return null;
        }
    }

    /* renamed from: com.etao.feimagesearch.mnn.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0230a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ kotlin.reflect.k[] f6747a;

        static {
            kge.a(827212750);
            f6747a = new kotlin.reflect.k[]{t.a(new PropertyReference1Impl(t.b(C0230a.class), "instance", "getInstance()Lcom/etao/feimagesearch/mnn/AdvanceAutoDetectObjectUnit;"))};
        }

        public final a a() {
            Object value;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                value = ipChange.ipc$dispatch("5a23392d", new Object[]{this});
            } else {
                kotlin.d a2 = a.a();
                C0230a c0230a = a.Companion;
                value = a2.getValue();
            }
            return (a) value;
        }

        private C0230a() {
        }

        public /* synthetic */ C0230a(o oVar) {
            this();
        }
    }

    private a() {
        super("plt_autodetect");
        this.f6746a = new com.etao.feimagesearch.mnn.utils.b();
        this.b = new NetConfig("plt_autodetect", "plt_autodetect", "", "");
        this.d = "";
    }

    public /* synthetic */ a(o oVar) {
        this();
    }

    public static final /* synthetic */ NetConfig a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (NetConfig) ipChange.ipc$dispatch("fe881839", new Object[]{aVar}) : aVar.b;
    }

    public static final /* synthetic */ kotlin.d a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (kotlin.d) ipChange.ipc$dispatch("bc9a1587", new Object[0]) : c;
    }

    public static final /* synthetic */ void a(a aVar, Bitmap bitmap, Map map, long j, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("715b222", new Object[]{aVar, bitmap, map, new Long(j), dVar});
        } else {
            aVar.a(bitmap, map, j, dVar);
        }
    }

    public static final /* synthetic */ com.etao.feimagesearch.mnn.utils.b b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.etao.feimagesearch.mnn.utils.b) ipChange.ipc$dispatch("21f0366a", new Object[]{aVar}) : aVar.f6746a;
    }

    @Override // com.etao.feimagesearch.mnn.BaseMnnRunUnit, com.etao.feimagesearch.mnn.e
    public /* bridge */ /* synthetic */ void a(Object obj, Object obj2, d dVar) {
        a((com.etao.feimagesearch.nn.optimize.a) obj, obj2, (d<OptimizeOutput>) dVar);
    }

    static {
        kge.a(997468166);
        Companion = new C0230a(null);
        c = kotlin.e.a(LazyThreadSafetyMode.SYNCHRONIZED, AdvanceAutoDetectObjectUnit$Companion$instance$2.INSTANCE);
    }

    @Override // com.etao.feimagesearch.mnn.BaseMnnRunUnit, com.etao.feimagesearch.mnn.e
    public void a(k callback, String activityHashCode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("322563a7", new Object[]{this, callback, activityHashCode});
            return;
        }
        q.c(callback, "callback");
        q.c(activityHashCode, "activityHashCode");
        String b2 = cof.b(com.etao.feimagesearch.config.b.ADVANCE_AUTODETECT_EXPERIMENT);
        if (b2 == null) {
            b2 = "asDefaultBucketId";
        }
        c(b2);
        String dj = com.etao.feimagesearch.config.b.dj();
        q.a((Object) dj, "ConfigModel.getAutoDetectAlgoConfig()");
        this.d = dj;
        com.etao.feimagesearch.mnn.b.Companion.a().b();
        super.a(new b(System.currentTimeMillis(), callback), activityHashCode);
    }

    /* loaded from: classes3.dex */
    public static final class b implements k {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ long b;
        public final /* synthetic */ k c;

        public b(long j, k kVar) {
            this.b = j;
            this.c = kVar;
        }

        @Override // com.etao.feimagesearch.mnn.k
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            long currentTimeMillis = System.currentTimeMillis() - this.b;
            this.c.a();
            com.etao.feimagesearch.mnn.utils.a.a(a.a(a.this), currentTimeMillis);
        }

        @Override // com.etao.feimagesearch.mnn.k
        public void a(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str});
                return;
            }
            long currentTimeMillis = System.currentTimeMillis() - this.b;
            this.c.a(i, str);
            com.etao.feimagesearch.mnn.utils.a.a(a.a(a.this), currentTimeMillis, String.valueOf(i), str);
        }
    }

    public void a(com.etao.feimagesearch.nn.optimize.a optimizeInput, Object obj, d<OptimizeOutput> callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55555260", new Object[]{this, optimizeInput, obj, callback});
            return;
        }
        q.c(optimizeInput, "optimizeInput");
        q.c(callback, "callback");
        cot.d(TAG, "call run ----");
        byte[] bArr = optimizeInput.f6920a;
        q.a((Object) bArr, "optimizeInput.yuv");
        f.c a2 = com.etao.feimagesearch.util.f.a(bArr, optimizeInput.c, optimizeInput.d, optimizeInput.v, optimizeInput.b);
        if (a2 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.etao.feimagesearch.util.DataProjector.CamDataInput");
        }
        Bitmap bitmap = ((f.b) a2).b(optimizeInput.e, optimizeInput.f).a();
        q.a((Object) bitmap, "bitmap");
        a(bitmap, optimizeInput.u, callback);
    }

    @Override // com.etao.feimagesearch.mnn.BaseMnnRunUnit
    public void a(HashMap<String, Object> args) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("656bbc4b", new Object[]{this, args});
            return;
        }
        q.c(args, "args");
        if (TextUtils.isEmpty(this.d)) {
            return;
        }
        args.put(com.etao.feimagesearch.mnn.utils.a.KEY_CONFIG_STRING, this.d);
    }

    private final void a(Bitmap bitmap, boolean z, d<OptimizeOutput> dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25d82e6a", new Object[]{this, bitmap, new Boolean(z), dVar});
            return;
        }
        HashMap<String, Object> a2 = com.etao.feimagesearch.mnn.utils.a.a(bitmap);
        if (a2 != null) {
            long currentTimeMillis = System.currentTimeMillis();
            this.f6746a.f();
            a(a2, z, new c(currentTimeMillis, this, z, dVar, bitmap));
            return;
        }
        a(bitmap, (i) null, 0L, dVar);
    }

    private final void a(Bitmap bitmap, Map<String, Object> map, long j, d<OptimizeOutput> dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52113601", new Object[]{this, bitmap, map, new Long(j), dVar});
            return;
        }
        com.etao.feimagesearch.mnn.c a2 = com.etao.feimagesearch.mnn.c.a(map);
        String extraInfo = com.etao.feimagesearch.mnn.utils.a.a(map);
        String str = (String) map.get("perf_record");
        com.etao.feimagesearch.mnn.b a3 = com.etao.feimagesearch.mnn.b.Companion.a();
        q.a((Object) extraInfo, "extraInfo");
        a3.a(extraInfo);
        if (a2 == null || a2.a() == null || !a2.c()) {
            a(bitmap, (i) null, j, str, dVar);
            return;
        }
        i iVar = new i(a2.a(), a2.b(), extraInfo, str);
        iVar.f6781a = false;
        a(bitmap, iVar, j, dVar);
    }

    private final void a(Bitmap bitmap, i iVar, long j, String str, d<OptimizeOutput> dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9e7468d", new Object[]{this, bitmap, iVar, new Long(j), str, dVar});
        } else if (iVar != null && iVar.f6781a) {
            a(true);
            OptimizeOutput optimizeOutput = OptimizeOutput.a(iVar.a(), iVar.c, bitmap, "plt_autodetect", b(), iVar.d, j, iVar.e);
            q.a((Object) optimizeOutput, "optimizeOutput");
            dVar.a((d<OptimizeOutput>) optimizeOutput);
            coy.a(com.etao.feimagesearch.structure.capture.a.f6987a, "objectDetected", 19999, BaseMnnRunUnit.KEY_TASK_NAME, "plt_autodetect");
            cot.a("AutoDetect", "objectDetected", "taskName: plt_autodetect");
        } else if (iVar != null && !iVar.f6781a) {
            a(true);
            OptimizeOutput optimizeOutput2 = OptimizeOutput.a(iVar.a(), iVar.c, bitmap, "plt_autodetect", b(), iVar.d, j, iVar.e);
            q.a((Object) optimizeOutput2, "optimizeOutput");
            dVar.a((d<OptimizeOutput>) optimizeOutput2);
            coy.a(com.etao.feimagesearch.structure.capture.a.f6987a, "objectDetected", 19999, BaseMnnRunUnit.KEY_TASK_NAME, "plt_autodetect");
            cot.a("AutoDetect", "objectDetected", "taskName: plt_autodetect");
        } else {
            a(false);
            OptimizeOutput optimizeOutput3 = OptimizeOutput.a(null, null, null, j, str);
            q.a((Object) optimizeOutput3, "optimizeOutput");
            dVar.a((d<OptimizeOutput>) optimizeOutput3);
        }
    }

    private final void a(Bitmap bitmap, i iVar, long j, d<OptimizeOutput> dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef3a6603", new Object[]{this, bitmap, iVar, new Long(j), dVar});
        } else {
            a(bitmap, iVar, j, (String) null, dVar);
        }
    }

    private final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (this.f6746a.d() >= 1000) {
        } else {
            this.f6746a.a(z);
            this.f6746a.b(true);
            com.etao.feimagesearch.mnn.utils.a.a("mnnAdvanceDetectionResult", this.f6746a);
        }
    }

    @Override // com.etao.feimagesearch.mnn.BaseMnnRunUnit, com.etao.feimagesearch.mnn.e
    public void a(String activityHashCode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, activityHashCode});
            return;
        }
        q.c(activityHashCode, "activityHashCode");
        super.a(activityHashCode);
        com.etao.feimagesearch.mnn.b.Companion.a().b();
    }
}
